package com.rajasulemantariq.i230848

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FriendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friends)
        findViewById<android.view.View>(R.id.nav_home).setOnClickListener { finish() }
        findViewById<android.view.View>(R.id.nav_marketplace).setOnClickListener { startActivity(Intent(this, MarketplaceActivity::class.java)) }
        findViewById<android.view.View>(R.id.nav_notifications).setOnClickListener { startActivity(Intent(this, NotificationsActivity::class.java)) }
        findViewById<android.view.View>(R.id.nav_menu).setOnClickListener { startActivity(Intent(this, MenuActivity::class.java)) }
    }
}