package com.example.task

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class DateTimePicker : AppCompatActivity() {

    lateinit var btn_calendar : Button
    lateinit var calendarview : TextView

    lateinit var btn_time : Button
    lateinit var timeview : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time_picker)

        btn_calendar = findViewById(R.id.calendar_btn)
        calendarview = findViewById(R.id.calendarTv)

        btn_time = findViewById(R.id.time_btn)
        timeview = findViewById(R.id.timeTv)

        btn_calendar.setOnClickListener {
            loadCalendar()
        }

        btn_time.setOnClickListener {
            loadTimePicker()
        }
    }

    private fun loadCalendar() {
        val cal = Calendar.getInstance()
        val year = cal.get(Calendar.YEAR)
        val month = cal.get(Calendar.MONTH)
        val day = cal.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener {view, year, monthOfYear,dayOfMonth ->
                calendarview.text = "Selected Date : $dayOfMonth/$monthOfYear/$year"
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }

    private fun loadTimePicker() {
        val time = Calendar.getInstance()
        val hour = time.get(Calendar.HOUR_OF_DAY)
        val min = time.get(Calendar.MINUTE)

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener {TimePicker, hour, min ->
                timeview.text = "$hour:$min"
            },
            hour,
            min,
            true
        )
        timePickerDialog.show()
    }

}