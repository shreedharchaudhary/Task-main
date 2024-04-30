package com.example.task

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioBtn : AppCompatActivity() {
    lateinit var rb1 : RadioButton
    lateinit var rb2 : RadioButton
    lateinit var rb3 : RadioButton
    lateinit var img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_btn)

        rb1 = findViewById(R.id.ronaldo)
        rb2 = findViewById(R.id.messi)
        rb3 = findViewById(R.id.neymar)
        img = findViewById(R.id.image)

        rb1.setOnClickListener{
            img.setImageResource(R.drawable.ronaldo)
        }
        rb2.setOnClickListener{
            img.setImageResource(R.drawable.messi)
        }
        rb3.setOnClickListener {
            img.setImageResource(R.drawable.neymar)
        }

    }
}