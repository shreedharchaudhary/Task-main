package com.example.task

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AutoCompleteActivity : AppCompatActivity() {

    private val languages = arrayOf("Nepali","Hindi","English","French","German","Newari","Swahili")
    lateinit var autoComplete : AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoComplete = findViewById(R.id.autoComplete)

        val autoCompleteAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_dropdown_item_1line,
            languages
        )
        autoComplete.setAdapter(autoCompleteAdapter)
        autoComplete.threshold = 1
    }
}