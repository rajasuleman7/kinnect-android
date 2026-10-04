package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NotificationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        findViewById<android.view.View>(R.id.nav_home).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.nav_friends).setOnClickListener { startActivity(Intent(this, FriendsActivity::class.java)) }
        findViewById<android.view.View>(R.id.nav_marketplace).setOnClickListener { startActivity(Intent(this, MarketplaceActivity::class.java)) }
        findViewById<android.view.View>(R.id.nav_menu).setOnClickListener { startActivity(Intent(this, MenuActivity::class.java)) }
    }
}