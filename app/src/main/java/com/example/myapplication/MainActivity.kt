package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.speech.tts.TextToSpeech
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var mTTS:TextToSpeech
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




       //Text to speech code
        mTTS = TextToSpeech(applicationContext, TextToSpeech.OnInitListener { status ->
            if (status != TextToSpeech.ERROR) {
                //if there is no error then set language
                mTTS.language = Locale.US
            }

        })

        // Hello button
        val btn_click_me3 = findViewById(R.id.button2) as Button
        btn_click_me3.setOnClickListener {
            val toSpeak1="hello"
            //Toast.makeText(this, toSpeak1, Toast.LENGTH_SHORT)
            mTTS.speak(toSpeak1, TextToSpeech.QUEUE_FLUSH, null)
        }


        // Thankyou button
        val btn_click_me4 = findViewById(R.id.button3) as Button
        btn_click_me4.setOnClickListener {
            val toSpeak2="Thank you"
            (mTTS.speak(toSpeak2, TextToSpeech.QUEUE_FLUSH, null))
        }


        // Yes button
        val btn_click_me6 = findViewById(R.id.button5) as Button
        btn_click_me6.setOnClickListener {
            val toSpeak3="Yes"
            mTTS.speak(toSpeak3, TextToSpeech.QUEUE_FLUSH, null)
        }


        // No button
        val btn_click_me5 = findViewById(R.id.button7) as Button
        btn_click_me5.setOnClickListener {
            val toSpeak4="No"
            mTTS.speak(toSpeak4, TextToSpeech.QUEUE_FLUSH, null)
        }




        // Food button
        val btn_click_me = findViewById(R.id.button9) as Button
        btn_click_me.setOnClickListener {
            val intent= Intent(this, food::class.java)
            startActivity(intent)

        }
        //Feelings button
        val btn_click_me2 = findViewById(R.id.button8) as Button
        btn_click_me2.setOnClickListener {
            val intent= Intent(this, Feelings::class.java)
            startActivity(intent)

        }
        // Direction button
        val btn_click_mej = findViewById(R.id.button) as Button
        btn_click_mej.setOnClickListener {
            val intent= Intent(this, Direction::class.java)
            startActivity(intent)

        }
            // Emergency button to call 911
        val btn_click_mee = findViewById(R.id.button29) as Button
        btn_click_mee.setOnClickListener {
            //get input from edit text
            var number = "911"

            //Dialer intent
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + Uri.encode(number)))
            startActivity(intent)
        }

        // About me button
        val btn_click_meq = findViewById(R.id.button6) as Button
        btn_click_meq.setOnClickListener {
            val intent= Intent(this, About::class.java)
            startActivity(intent)

        }


    }

}

