package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import java.util.*

class Feelings : AppCompatActivity() {

    lateinit var mJTS:TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feelings)


        // Back button

        var actionbar = getSupportActionBar()
        actionbar!!.title = "Home"
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)




    //Text to speech code
    mJTS = TextToSpeech(applicationContext, TextToSpeech.OnInitListener { status ->
        if (status != TextToSpeech.ERROR) {
            //if there is no error then set language
            mJTS.language = Locale.US
        }
    })

        // happy button
    val happy = findViewById(R.id.button15) as Button
    happy.setOnClickListener{
        val toSpeak2 = "I feel happy"
        // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
        (mJTS.speak(toSpeak2, TextToSpeech.QUEUE_FLUSH, null))
    }

        //sad button
        val sad = findViewById(R.id.button17) as Button
        sad.setOnClickListener {
            val toSpeak3 = "I feel sad"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mJTS.speak(toSpeak3, TextToSpeech.QUEUE_FLUSH, null))

        }

        // angry button
        val angry = findViewById(R.id.button18) as Button
        angry.setOnClickListener {
            val toSpeak4 = "I feel angry"
            // Toast.makeText(this, toSpeak4, Toast.LENGTH_SHORT)
            (mJTS.speak(toSpeak4, TextToSpeech.QUEUE_FLUSH, null))
        }

        // tired button
        val disg = findViewById(R.id.button19) as Button
        disg.setOnClickListener {
            val toSpeak5 = "I feel tired"
            // Toast.makeText(this, toSpeak5, Toast.LENGTH_SHORT)
            (mJTS.speak(toSpeak5, TextToSpeech.QUEUE_FLUSH, null))
        }

        //exited button
        val exited = findViewById(R.id.button20) as Button
        exited.setOnClickListener {
            val toSpeak6 = "I feel excited"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mJTS.speak(toSpeak6, TextToSpeech.QUEUE_FLUSH, null))
        }

        //sleepy button
        val sleepy = findViewById(R.id.button21) as Button
        sleepy.setOnClickListener {
            val toSpeak7 = "I feel sleepy"
            // Toast.makeText(this, toSpeak2, Toast.LENGTH_SHORT)
            (mJTS.speak(toSpeak7, TextToSpeech.QUEUE_FLUSH, null))
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}