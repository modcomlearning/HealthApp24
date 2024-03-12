package com.example.healthapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CausesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_causes)

        val webcauses = findViewById<WebView>(R.id.webcauses)
        webcauses.loadUrl("file:///android_asset/causes.html")
    }
}