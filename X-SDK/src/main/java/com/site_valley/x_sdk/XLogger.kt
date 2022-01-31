/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 31/01/22, 3:24 PM
 */

package com.site_valley.x_sdk

import android.util.Log
import com.google.gson.Gson

object XLogger {

    /**
     * Logs Always
     * @param any Any Object Or String
     *
     */
    fun logE(any: Any) {
        try {
            Log.e("XLogger:: ", Gson().toJson(any))
        } catch (e: Exception) {
            Log.e("XLogger Error:: ", e.localizedMessage.toString())
        }
    }

    fun logOnDebugE(any: Any) {
        if (BuildConfig.DEBUG) {
            logE(any)
        }
    }


}