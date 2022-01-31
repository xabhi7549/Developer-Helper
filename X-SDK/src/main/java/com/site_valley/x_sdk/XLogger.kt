/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 31/01/22, 4:04 PM
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

}