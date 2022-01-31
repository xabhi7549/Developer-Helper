/*
 * Created by abhinav for ETAOP Pvt. Ltd.
 * Copyright (c) 2022 . All rights reserved.
 * Last Updated on 31/01/22, 3:24 PM
 */

package com.site_valley.x_sdk

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class SampleSDKActivity(val string: String) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_sample_sdkactivity)
        findViewById<TextView>(R.id.name).text = string

    }
}