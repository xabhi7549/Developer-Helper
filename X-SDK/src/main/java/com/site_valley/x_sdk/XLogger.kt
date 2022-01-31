package com.site_valley.x_sdk

import android.util.Log
import com.google.gson.Gson

object XLogger {
    fun logE(any: Any){

        try {
            Log.e("XLogger:: ",Gson().toJson(any))
        }catch (e:Exception){
            Log.e("XLogger Error:: ",e.localizedMessage.toString())
        }

    }

}