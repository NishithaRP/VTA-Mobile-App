package com.example.vta_courses

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var context: Context
    private lateinit var next:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        context=this
       next=findViewById(R.id.btn_enter)
        next.setOnClickListener {
        var intent=Intent(this,Selection::class.java)
                startActivity(intent)

        }
    }
}