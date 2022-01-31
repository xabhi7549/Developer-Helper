/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 31/01/22, 4:04 PM
 */

package com.site_valley.x_sdk

import com.google.gson.JsonIOException
import com.google.gson.JsonSyntaxException

object XObjects {

    @Throws(JsonSyntaxException::class)
    fun <T> getObjectFromString(string: String, classType: Class<T>): T {
        return XGson.getXGson().fromJson(string, classType)
    }

    @Throws(JsonIOException::class)
    fun getStringFromObject(any: Any): String? {
        return XGson.getXGson().toJson(any)
    }

}