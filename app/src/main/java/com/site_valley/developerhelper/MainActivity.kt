/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 22/03/22, 8:26 AM
 */

package com.site_valley.developerhelper

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.site_valley.x_sdk.XLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        XLogger.logE("This Is A Test!!")
    }
}