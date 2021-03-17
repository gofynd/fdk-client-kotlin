package com.sdk.common

import android.net.Uri
import android.util.Log
import okhttp3.Request
import okio.Buffer
import java.security.MessageDigest
import java.text.SimpleDateFormat
import java.util.*
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec


class RequestSigner(val request: Request) {

    private var nowDateTime: String? = null
    private lateinit var updatedReq: Request
    private var signQuery: Boolean = false

    val HEADERS_TO_IGNORE = listOf(
        "authorization",
        "connection",
        "x-amzn-trace-id",
        "user-agent",
        "expect",
        "presigned-expires",
        "range"
    )

    val HEADERS_TO_INCLUDE = listOf("x-fp-.*", "host")

    fun sign(): Request {
        updatedReq = prepareRequest()
        updatedReq = if (signQuery) {
            val httpUrl =
                updatedReq.url().newBuilder().addQueryParameter("x-fp-signature", signature())
                    .build()
            updatedReq.newBuilder().url(httpUrl).build()
        } else {
            updatedReq.newBuilder().header("x-fp-signature", signature()).build()
        }
        return updatedReq
    }

    private fun prepareRequest(): Request {
        val newReqBuilder = request.newBuilder()
        if (signQuery) {
            val httpUrl =
                request.url().newBuilder().addQueryParameter("x-fp-date", getDateTime()).build()
            newReqBuilder.url(httpUrl)
        } else {
            newReqBuilder.header("x-fp-date", getDateTime())
        }
        newReqBuilder.header("host", request.url().host())
        return newReqBuilder.build()
    }

    private fun getDateTime(): String {
        if (nowDateTime == null) {
            val tz = TimeZone.getTimeZone("UTC")
            // Quoted "Z" to indicate UTC, no timezone offset
            val df = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
            df.timeZone = tz
            val nowAsISO: String = df.format(Date())
            nowDateTime = nowAsISO.replace("-", "")
                .replace(":", "")
                .replace("'", "")
        }
        return nowDateTime ?: ""
    }

    private fun signature(): String {
        val kCredentials = "1234567"
        val strToSign = stringToSign()
        Log.e("ReqSignER", "signature...... ${hMac(kCredentials, strToSign)}")
        return "v1:${hMac(kCredentials, strToSign)}";
    }

    private fun stringToSign(): String {
        Log.e("ReqSignER", "hash(canonicalString())...... ${hash(canonicalString())}")
        val strToSign = "${getDateTime()}\n${hash(canonicalString())}"
        Log.e("ReqSignER", "strToSign...... ${strToSign}")
        return strToSign
    }

    private fun hMac(key: String, strToSign: String): String {
        val sha256Hmac: Mac = Mac.getInstance("HmacSHA256")
        sha256Hmac.init(SecretKeySpec(key.toByteArray(), "HmacSHA256"))
        return bytesToHex(sha256Hmac.doFinal(strToSign.toByteArray()))

    }

    private fun hash(stringToDigest: String): String {
        val digest: MessageDigest = MessageDigest.getInstance("SHA-256")
        return bytesToHex(digest.digest(stringToDigest.toByteArray()))
    }

    private fun bytesToHex(hash: ByteArray): String {
        val hexString = StringBuilder(2 * hash.size)
        for (i in hash.indices) {
            val hex = Integer.toHexString(0xff and hash[i].toInt())
            if (hex.length == 1) {
                hexString.append('0')
            }
            hexString.append(hex)
        }
        return hexString.toString()
    }

    private fun canonicalString(): String {
        val encodedQueryPieces = StringBuilder("")
        if (updatedReq.url().querySize() > 0) {
            updatedReq.url().queryParameterNames().filter { it.isNotBlank() }.map {
                Uri.encode(it) ?: ""
            }.sorted().forEach { encodedQueryName ->
                updatedReq.url().queryParameterValues(Uri.decode(encodedQueryName)).map {
                    it//Uri.encode(it) ?: ""
                }.sorted().forEach { queryValue ->
                    val query = "${encodedQueryName}=${queryValue}"
                    if (encodedQueryPieces.isEmpty()) {
                        encodedQueryPieces.append(query)
                    } else {
                        encodedQueryPieces.append("&").append(query)
                    }
                }
            }
        }
        val canonicalQueryString = encodedQueryPieces.toString()
        Log.e("ReqSignER", "canonicalQueryString...... $canonicalQueryString")

        val encodedPathPieces = StringBuilder()
        updatedReq.url().encodedPathSegments().forEach { path ->
            //val path = "${Uri.encode(path)}"
            if (encodedPathPieces.isEmpty()) {
                encodedPathPieces.append("/").append(path)
            } else {
                encodedPathPieces.append("/").append(path)
            }
        }
        val canonicalPath = encodedPathPieces.toString()
        Log.e("ReqSignER", "canonicalPath...... $canonicalPath")

        val canonicalRequest = StringBuilder()

        canonicalRequest.append(updatedReq.method()).append("\n")
        canonicalRequest.append(canonicalPath).append("\n")
        canonicalRequest.append(canonicalQueryString).append("\n")
        canonicalRequest.append(canonicalHeaders()).append("\n").append("\n")
        canonicalRequest.append(signedHeaders()).append("\n")

        val bodyBuffer = Buffer()
        updatedReq.body()?.writeTo(bodyBuffer)
        val body = bodyBuffer.readUtf8()

        canonicalRequest.append(hash(body ?: ""))

        Log.e("ReqSignER", " body()...... ${body?: ""}")
        Log.e("ReqSignER", "hash(updatedReq.body())...... ${hash(body ?: "")}")


        return canonicalRequest.toString()
    }

    private fun canonicalHeaders(): String {
        val canonicalHeader = StringBuilder()
        updatedReq.headers().names().filter { headerName ->
            val notInIgnoreHeader = !HEADERS_TO_IGNORE.contains(headerName.toLowerCase())
            if (notInIgnoreHeader) {
                var foundMatch = false
                HEADERS_TO_INCLUDE.forEach { regExp ->
                    foundMatch = foundMatch ||
                            Regex(regExp, RegexOption.IGNORE_CASE).matches(headerName)
                }
                foundMatch
            } else {
                false
            }
        }.sortedBy { headerName ->
            headerName.toLowerCase()
        }.forEach { headerName ->
            updatedReq.headers().values(headerName).forEach { headerValue ->
                if (canonicalHeader.isNotEmpty()) {
                    canonicalHeader.append("\n")
                }
                canonicalHeader.append(headerName).append(":").append(headerValue.trim())
            }
        }

        Log.e("ReqSignER", "canonicalHeader...... $canonicalHeader")

        return canonicalHeader.toString()
    }

    private fun signedHeaders(): String {
        val headerNames = StringBuilder()
        updatedReq.headers().names().filter { headerName ->
            val notInIgnoreHeader = !HEADERS_TO_IGNORE.contains(headerName.toLowerCase())
            if (notInIgnoreHeader) {
                var foundMatch = false
                HEADERS_TO_INCLUDE.forEach { regExp ->
                    foundMatch = foundMatch ||
                            Regex(regExp, RegexOption.IGNORE_CASE).matches(headerName)
                }
                foundMatch
            } else {
                false
            }
        }.sortedBy { headerName ->
            headerName.toLowerCase()
        }.forEach { headerName ->
            if (headerNames.isNotEmpty()) {
                headerNames.append(";")
            }
            headerNames.append(headerName.trim())
        }
        Log.e("ReqSignER", "signedHeaders...... ${headerNames.toString()}")

        return headerNames.toString()
    }
}

