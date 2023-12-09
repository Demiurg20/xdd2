package com.example.xdd2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class thirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
    }

    fun onClickGoMain(view : View) {
        val intent = Intent(this, FourthActivity::class.java)
        startActivity(intent)
    }
}