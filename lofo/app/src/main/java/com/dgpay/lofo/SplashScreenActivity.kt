package com.dgpay.lofo

import android.content.Intent
import android.net.sip.SipErrorCode.TIME_OUT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.dgpay.lofo.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    private fun loadSplashScreen(){
        Handler().postDelayed({
            // You can declare your desire activity here to open after finishing splash screen. Like MainActivity
            val intent = Intent(this@SplashScreenActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        },TIME_OUT)
    }

    private var TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        loadSplashScreen()
    }
}