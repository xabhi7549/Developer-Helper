/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 05/02/22, 9:01 PM
 */

package com.site_valley.x_sdk

import android.util.Log

object XLogger {

    /**
     * Logs Always
     * @param any Any Object Or String
     *
     */
    fun logE(any: Any) {
        try {
            Log.e("XLogger:: ", XObjects.getStringFromObject(any).toString())
        } catch (e: Exception) {
            Log.e("XLogger Error:: ", e.localizedMessage.toString())
        }
    }

    /**
     * Logs Always
     * @param key string that you want to show
     * @param any Any Object Or String
     *
     */
    fun logE(key: String, any: Any) {
        try {
            Log.e("XLogger:: $key :", XObjects.getStringFromObject(any).toString())
        } catch (e: Exception) {
            Log.e("XLogger Error:: ", e.localizedMessage.toString())
        }
    }

}