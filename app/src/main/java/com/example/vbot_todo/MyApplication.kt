package com.example.vbot_todo

import android.app.Application
import io.dcloud.feature.sdk.DCSDKInitConfig
import io.dcloud.feature.sdk.DCUniMPSDK

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Cấu hình SDK
        val config = DCSDKInitConfig.Builder().build()

        // Khởi tạo SDK
        DCUniMPSDK.getInstance().initialize(this, config)
    }
}