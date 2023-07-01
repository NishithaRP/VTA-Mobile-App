package com.example.vta_courses

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Selection : AppCompatActivity() {

    private lateinit var CourseBtn: TextView
    private lateinit var CenterBtn: TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)

        CourseBtn=findViewById(R.id.textViewCourse)
        CenterBtn=findViewById(R.id.textViewCenter)

        CourseBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,course::class.java)
            startActivity(intent)
        })

        CenterBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,center::class.java)
            startActivity(intent)
        })

    }
}