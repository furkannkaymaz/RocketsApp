package com.example.rocketapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rocketapp.R
import com.example.rocketapp.adapters.RocketsAdapters
import com.example.rocketapp.managers.ServiceManager

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val decorView = window.decorView
        decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)


        ServiceManager().Rockets(
            {

                object : CountDownTimer(3000, 1000) {
                    override fun onFinish() {
                        var intent = Intent(this@SplashActivity, MainActivity::class.java)
                        startActivity(intent)
                    }
                    override fun onTick(millisUntilFinished: Long) {
                    }

                }.start()


            },
            {
            }
        )
        animations()
    }

  override fun onResume() {
      super.onResume()
  }

    fun animations() {
        val anim = findViewById<ImageView>(R.id.circleimage)
        val circleimage = AnimationUtils.loadAnimation(this, R.anim.rotate)
        anim.startAnimation(circleimage)
    }
}