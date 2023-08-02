package com.sdk.application

import android.net.Uri
import android.util.Log
import com.sdk.common.Utils
import org.json.JSONException
import com.sdk.application.models.content.ActionPage

object NavigationHelper {

    fun getNavigator(name: String): Navigator? {
        return Navigator.values().find {
            it.pageType == PageType.valueOfPageType(name)
        }
    }

    fun getNavigator(pageType: PageType): Navigator? {
        return Navigator.values().find {
            it.pageType == pageType
        }
    }

    fun getActionFromUrl(
        url: String
    ): ActionPage? {

        val uri = Uri.parse(url)

        val pageType: PageType? = PageType.fromUrl(url)
        val currentNavigator: Navigator? = pageType?.let { getNavigator(it) }

        val pathSegments: MutableList<String> = uri.pathSegments
        val query: String? = uri.query

        val paramsList = ArrayList<String>()
        val queryParams = HashMap<String, ArrayList<String>>()
        val params = HashMap<String, ArrayList<String>>()
        if (currentNavigator != null) {
            if (!currentNavigator.params.isNullOrEmpty()) {
                val navParam = currentNavigator.params[0]
                if (navParam.required) {
                    if (pathSegments.size == 1) {
                        Log.d("cosmos", "slug is required and it is not found")
                    } else {
                        for (i in 1 until pathSegments.size) {
                            paramsList.add(pathSegments[i])
                        }
                        params[navParam.key] = paramsList
                    }
                } else if (pathSegments.size > 1) {
                    for (i in 1 until pathSegments.size) {
                        paramsList.add(pathSegments[i])
                    }
                    navParam.key.let {
                        params[it] = paramsList
                    }
                }
            }
        }else{
            return null
        }

        if (!query.isNullOrEmpty()) {
            val queryArray = query.split("&")
            if (!queryArray.isNullOrEmpty()) {
                queryArray.forEach {
                    val key = Utils.splitString(it, "=", 2)
                    val valueList = ArrayList<String>()
                    if (key.isNotEmpty() && key.size > 1) {
                        valueList.add(key[1])
                    }
                    if (queryParams.get(key = key[0]) == null) {
                        queryParams[key[0]] = valueList
                    } else {
                        queryParams[key[0]]?.addAll(valueList)
                    }

                }
            }
        }

        val actionPage = ActionPage()
        actionPage.type = pageType
        actionPage.params = params
        actionPage.query = queryParams

        return actionPage

    }

}