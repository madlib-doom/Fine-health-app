package com.example.finehealthapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class splashactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splashactivity)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        move to the main activity after 5seconds
        Handler().postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
            finish()
        },5000)
        val logo1 = findViewById<ImageView>(R.id.logo1)
        val logo2 = findViewById<ImageView>(R.id.logo2)

        // Load the bounce-fade animations
        val bounceFade1 = AnimationUtils.loadAnimation(this, R.anim.bounce_fade)
        val bounceFade2 = AnimationUtils.loadAnimation(this, R.anim.bounce_fade_alt)

        // Start them
        logo1.startAnimation(bounceFade1)
        logo2.startAnimation(bounceFade2)


    }
}