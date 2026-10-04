package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        findViewById<android.view.View>(R.id.btn_back).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.btn_call).setOnClickListener { startActivity(Intent(this, VoiceCallActivity::class.java)) }
    }
}