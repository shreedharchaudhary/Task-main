package com.example.task

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SpinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    lateinit var label : TextView
    lateinit var result : TextView
    lateinit var spinner : Spinner
    var data = arrayOf("Momo","Rice","Pizza","Pasta","Sandwich","Lakhamari")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        label = findViewById(R.id.label)
        result = findViewById(R.id.label_result)
        spinner = findViewById(R.id.spinner)
        spinner.onItemSelectedListener = this

        var adapter = ArrayAdapter(this, //context
            android.R.layout.simple_spinner_item, //template
            data //dataset
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        if (parent!=null){
            result.text = parent?.getItemAtPosition(position).toString()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}