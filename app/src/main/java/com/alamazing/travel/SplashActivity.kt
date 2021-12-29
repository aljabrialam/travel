package com.alamazing.travel

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({ // Start your app main activity
            val i = Intent(this@SplashActivity, LandingActivity::class.java)
            startActivity(i)
            // close this activity
            finish()
        },1500)
    }
}