package com.site_valley.developerhelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.site_valley.x_sdk.XLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
XLogger.logE("This Is A Test!!")
    }
}