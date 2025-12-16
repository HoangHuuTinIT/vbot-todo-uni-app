package com.example.vbot_todo

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import io.dcloud.feature.sdk.DCUniMPSDK

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnGoToMiniApp = findViewById<Button>(R.id.btnGoToMiniApp)
        btnGoToMiniApp.setOnClickListener(View.OnClickListener {
            // Thay "__UNI__04E3A11" bằng AppID của bạn
            DCUniMPSDK.getInstance().openUniMP(this, "__UNI__G56F9CE0")
        })
    }
}