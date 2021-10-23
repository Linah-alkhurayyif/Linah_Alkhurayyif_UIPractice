package com.example.linah_alkhurayyif_uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_facebook.*
import kotlinx.android.synthetic.main.activity_facebook.arrow_back_f
import kotlinx.android.synthetic.main.activity_instagram.*

class InstagramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        arrow_back_i.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}