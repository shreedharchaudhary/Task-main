package com.example.task

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.text_button)
        btn2 = findViewById(R.id.radio_button)
        btn3 = findViewById(R.id.spinner_button)
        btn4 = findViewById(R.id.autocomplete_button)
        btn5 = findViewById(R.id.datentime_button)

        btn1.setOnClickListener {
            val intent = Intent(this@MainActivity, TextViewActivity::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener{
            val intent = Intent(this@MainActivity, RadioBtn::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener{
            val intent = Intent(this@MainActivity, SpinnerActivity::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener{
            val intent = Intent(this@MainActivity, AutoCompleteActivity::class.java)
            startActivity(intent)
        }

        btn5.setOnClickListener{
            val intent = Intent(this@MainActivity, DateTimePicker::class.java)
            startActivity(intent)
        }

    }
}