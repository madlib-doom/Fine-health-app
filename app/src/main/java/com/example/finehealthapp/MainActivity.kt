package com.example.finehealthapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.finehealthapp.R.id.main

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        Find all the card views of their ids and do an explicit intent to the different activities
        val cardAbout=findViewById<CardView>(R.id.cardabout)
        val CardCauses=findViewById<CardView>(R.id.cardcause)
        val CardSymptoms=findViewById<CardView>(R.id.cardsymptoms)
        val CardPrevention=findViewById<CardView>(R.id.cardprevention)
        val Cardareas=findViewById<CardView>(R.id.cardlocation)
        val CardContact=findViewById<CardView>(R.id.cardtel)
        
        CardCauses.setOnClickListener { 
            val causes= Intent(applicationContext, CausesActivity::class.java)
            startActivity(causes)
        } //end listener
        cardAbout.setOnClickListener {
            val about = Intent(applicationContext, AboutActivity::class.java)
            startActivity(about)
        } //end listener
    CardSymptoms.setOnClickListener {
        val symptomspage= Intent(applicationContext, SymptomsActivity::class.java)
        startActivity(symptomspage)

    } //end listener

        CardPrevention.setOnClickListener {
            val prevent= Intent(applicationContext, PreventionActivity::class.java)
            startActivity(prevent)

        } //end listener
        Cardareas.setOnClickListener {
            val locate= Intent(applicationContext, AreasActivity::class.java)
            startActivity(locate)

        } //end listener

        CardContact.setOnClickListener {
            val phone= Intent(applicationContext, ContactActivity::class.java)
            startActivity(phone)

        } //end listener




    }
}