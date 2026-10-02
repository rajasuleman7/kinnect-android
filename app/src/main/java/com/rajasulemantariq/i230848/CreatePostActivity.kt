package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CreatePostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
        findViewById<android.view.View>(R.id.btn_close).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.row_photo).setOnClickListener { startActivity(Intent(this, PhotoPickerActivity::class.java)) }
        findViewById<android.view.View>(R.id.row_camera).setOnClickListener { startActivity(Intent(this, CameraActivity::class.java)) }
    }
}