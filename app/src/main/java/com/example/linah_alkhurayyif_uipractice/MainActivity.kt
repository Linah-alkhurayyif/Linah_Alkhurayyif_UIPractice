package com.example.linah_alkhurayyif_uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        facebook_layout.setOnClickListener {
            val intent = Intent(this, FacebookActivity::class.java)
            startActivity(intent)
        }
        instagram_layout.setOnClickListener {
            val intent = Intent(this, InstagramActivity::class.java)
            startActivity(intent)
        }
    }
}