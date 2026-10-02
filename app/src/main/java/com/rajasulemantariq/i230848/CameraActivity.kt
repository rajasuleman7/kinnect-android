package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        findViewById<android.view.View>(R.id.btn_close).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.btn_shutter).setOnClickListener { startActivity(Intent(this, StoryEditorActivity::class.java)) }
    }
}