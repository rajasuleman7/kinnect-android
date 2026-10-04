package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class VoiceCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voice_call)
        findViewById<android.view.View>(R.id.btn_end_call).setOnClickListener { finish() }
    }
}