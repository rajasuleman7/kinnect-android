package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        findViewById<android.view.View>(R.id.btn_cancel).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.btn_save).setOnClickListener { finish() }
    }
}