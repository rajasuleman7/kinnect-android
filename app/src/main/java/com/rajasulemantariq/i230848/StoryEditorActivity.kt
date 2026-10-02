package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StoryEditorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_editor)
        findViewById<android.view.View>(R.id.btn_close).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.btn_your_story).setOnClickListener { startActivity(Intent(this, YourStoryActivity::class.java)) }
    }
}