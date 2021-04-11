package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import java.util.*

class food : AppCompatActivity() {

    lateinit var mKTS: TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)


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

        // Drink button
        val drink = findViewById(R.id.button4) as Button
        drink.setOnClickListener {
            val toSpeak2 = "I need a drink"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak2, TextToSpeech.QUEUE_FLUSH, null))

        }

        // Snack button
        val snack = findViewById(R.id.button10) as Button
        snack.setOnClickListener {
            val toSpeak3 = "I need a snack"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak3, TextToSpeech.QUEUE_FLUSH, null))

        }

        // Cookie button
        val cookie = findViewById(R.id.button16) as Button
        cookie.setOnClickListener {
            val toSpeak7 = "I want cookies"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak7, TextToSpeech.QUEUE_FLUSH, null))

        }

        // Chips button
        val chips = findViewById(R.id.button22) as Button
        chips.setOnClickListener {
            val toSpeak8 = "I want chips"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak8, TextToSpeech.QUEUE_FLUSH, null))

        }


        // cerial button
        val cer = findViewById(R.id.button11) as Button
        cer.setOnClickListener {
            val toSpeak4 = "I want cerial"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak4, TextToSpeech.QUEUE_FLUSH, null))

        }


        // pizza button
        val piz = findViewById(R.id.button12) as Button
        piz.setOnClickListener {
            val toSpeak5 = "I want pizza"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak5, TextToSpeech.QUEUE_FLUSH, null))

        }

        // chicken button
        val chic = findViewById(R.id.button13) as Button
        chic.setOnClickListener {
            val toSpeak6= "I want chicken"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak6, TextToSpeech.QUEUE_FLUSH, null))

        }

            // burger button
        val bur = findViewById(R.id.button14) as Button
        bur.setOnClickListener {
            val toSpeak7 = "I want burger"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mKTS.speak(toSpeak7, TextToSpeech.QUEUE_FLUSH, null))

        }

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}