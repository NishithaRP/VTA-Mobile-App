package com.example.vta_courses


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner


class Register : AppCompatActivity() {
    private lateinit var context: Context
    private lateinit var next: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        context = this
        next = findViewById(R.id.btnsub)
        next.setOnClickListener {
            var intent = Intent(context,course::class.java)
            startActivity(intent)
        }
        val spinner: Spinner = findViewById(R.id.spinner)
        val qualificationArray = resources.getStringArray(R.array.qualification_array)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, qualificationArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        val spinnerM: Spinner = findViewById(R.id.spinnerMonth)
        val MArray = resources.getStringArray(R.array.month_array)

        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item,MArray)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerM.adapter = adapter2

        val spinnerD: Spinner = findViewById(R.id.spinnerDay)
        val DArray = resources.getStringArray(R.array.day_array)

        val adapter3 = ArrayAdapter(this, android.R.layout.simple_spinner_item,DArray)
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerD.adapter = adapter3

    }
}




