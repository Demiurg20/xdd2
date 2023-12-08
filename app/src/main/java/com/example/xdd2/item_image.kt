package com.example.xdd2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class item_image : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_image)
    }

    fun onClickGoMain(view : View) {
        val intent = Intent(this, second_activity::class.java)
        startActivity(intent)
    }
}