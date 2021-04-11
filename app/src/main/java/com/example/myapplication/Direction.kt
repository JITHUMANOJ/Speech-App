package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import java.util.*

class Direction : AppCompatActivity() {

    lateinit var mKTS:TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direction)


        // Back button

        var actionbar = getSupportActionBar()
        actionbar!!.title = "Home"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        //Text to speech code
        mKTS = TextToSpeech(applicationContext, TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR) {
                //if there is no error then set language
                mKTS.language = Locale.US
            }
        })

        // bathroom button
        val bathroom = findViewById(R.id.button23) as Button
        bathroom.setOnClickListener{
            val toSpeak2 = "I need to use the bathroom"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak2, TextToSpeech.QUEUE_FLUSH, null))
        }

        // home button
        val home = findViewById(R.id.button24) as Button
        home.setOnClickListener{
            val toSpeak3 = "I wanna go home"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak3, TextToSpeech.QUEUE_FLUSH, null))
        }

        // park button
        val park = findViewById(R.id.button25) as Button
        park.setOnClickListener{
            val toSpeak4 = "I wanna go to the park"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak4, TextToSpeech.QUEUE_FLUSH, null))
        }

        // playground button
        val playground = findViewById(R.id.button26) as Button
        playground.setOnClickListener{
            val toSpeak5 = "I wanna go to the playground"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak5, TextToSpeech.QUEUE_FLUSH, null))
        }

        // shop button
        val shop = findViewById(R.id.button27) as Button
        shop.setOnClickListener{
            val toSpeak6 = "I wanna go to the shop"
            // Toast.makeText(this, toSpeak6, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak6, TextToSpeech.QUEUE_FLUSH, null))
        }

        // garden button
        val garden = findViewById(R.id.button28) as Button
        garden.setOnClickListener{
            val toSpeak7 = "I wanna goto the garden"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak7, TextToSpeech.QUEUE_FLUSH, null))
        }


    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}