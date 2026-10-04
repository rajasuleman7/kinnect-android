package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ChatsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chats)
        findViewById<android.view.View>(R.id.btn_back).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.chat_aisha).setOnClickListener { startActivity(Intent(this, ChatActivity::class.java)) }
    }
}