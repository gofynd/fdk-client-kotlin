package com.sdk.common

import java.io.IOException
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.io.Serializable
import java.net.HttpCookie

class SerializableHttpCookie(private val httpCookie: HttpCookie) : Serializable {

    companion object {
        private const val serialVersionUID = 6374381323722046732L
    }

    private var clientCookie: HttpCookie? = null
    fun getCookie(): HttpCookie {
        var bestCookie = httpCookie
        clientCookie?.let {
            bestCookie = it
        }
        return bestCookie
    }

    @Throws(IOException::class)
    private fun writeObject(out: ObjectOutputStream) {
        out.writeObject(httpCookie.name)
        out.writeObject(httpCookie.value)
        out.writeObject(httpCookie.comment)
        out.writeObject(httpCookie.commentURL)
        out.writeObject(httpCookie.domain)
        out.writeLong(httpCookie.maxAge)
        out.writeObject(httpCookie.path)
        out.writeObject(httpCookie.portlist)
        out.writeInt(httpCookie.version)
        out.writeBoolean(httpCookie.secure)
        out.writeBoolean(httpCookie.discard)
    }

    @Throws(IOException::class, ClassNotFoundException::class)
    private fun readObject(ob: ObjectInputStream) {
        val name = ob.readObject() as String
        val value = ob.readObject() as String
        clientCookie = HttpCookie(name, value)
        clientCookie?.comment = ob.readObject() as String
        clientCookie?.commentURL = ob.readObject() as String
        clientCookie?.domain = ob.readObject() as String
        clientCookie?.maxAge = ob.readLong()
        clientCookie?.path = ob.readObject() as String
        clientCookie?.portlist = ob.readObject() as String
        clientCookie?.version = ob.readInt()
        clientCookie?.secure = ob.readBoolean()
        clientCookie?.discard = ob.readBoolean()
    }


}