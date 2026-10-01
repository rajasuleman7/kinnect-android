package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<android.view.View>(R.id.nav_friends).setOnClickListener { startActivity(Intent(this, FriendsActivity::class.java)) }
        findViewById<android.view.View>(R.id.nav_marketplace).setOnClickListener { startActivity(Intent(this, MarketplaceActivity::class.java)) }
        findViewById<android.view.View>(R.id.nav_notifications).setOnClickListener { startActivity(Intent(this, NotificationsActivity::class.java)) }
        findViewById<android.view.View>(R.id.nav_menu).setOnClickListener { startActivity(Intent(this, MenuActivity::class.java)) }
        findViewById<android.view.View>(R.id.btn_search).setOnClickListener { startActivity(Intent(this, SearchActivity::class.java)) }
        findViewById<android.view.View>(R.id.btn_chats).setOnClickListener { startActivity(Intent(this, ChatsActivity::class.java)) }
        findViewById<android.view.View>(R.id.btn_create_post).setOnClickListener { startActivity(Intent(this, CreatePostActivity::class.java)) }
        findViewById<android.view.View>(R.id.btn_create_story).setOnClickListener { startActivity(Intent(this, CameraActivity::class.java)) }
        findViewById<android.view.View>(R.id.btn_story).setOnClickListener { startActivity(Intent(this, StoryViewerActivity::class.java)) }
        findViewById<android.view.View>(R.id.btn_like).setOnClickListener { startActivity(Intent(this, ReactionActivity::class.java)) }
        findViewById<android.view.View>(R.id.btn_comment).setOnClickListener { startActivity(Intent(this, CommentsActivity::class.java)) }
        findViewById<android.view.View>(R.id.avatar_me).setOnClickListener { startActivity(Intent(this, ProfileActivity::class.java)) }
    }
}