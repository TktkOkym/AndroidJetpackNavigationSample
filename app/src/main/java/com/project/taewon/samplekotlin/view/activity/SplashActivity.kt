package com.project.taewon.samplekotlin.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.project.taewon.samplekotlin.R
import com.project.taewon.samplekotlin.constant.Constants

class SplashActivity : AppCompatActivity() {

    private var mDelayHandler: Handler? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Initialize the Handler
        mDelayHandler = Handler()

        // Navigate with delay
        mDelayHandler!!.postDelayed(mRunnable, Constants.SPLASH_TIME.toLong())
    }

    private val mRunnable: Runnable = Runnable {
        if (!isFinishing) {
            val intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
