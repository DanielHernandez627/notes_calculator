package com.pillo.notes_calculator

import android.content.Intent
import android.content.IntentSender.OnFinished
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {

    private var timer: CountDownTimer? = null
    private var timeDuration: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume(){
        super.onResume()
        timer?.cancel()
        startTimer()
    }

    private fun startTimer(){
        timer = object : CountDownTimer(timeDuration,1000){
            override fun onTick(millisUnitilFinished: Long){
                //Timer run
            }

            override fun onFinish(){
                val intent = Intent(this@MainActivity,main_menu::class.java)
                startActivity(intent)
            }
        }
        timer?.start()
    }
}