package com.gdsc.tablegenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number: EditText = findViewById(R.id.number)
        val generateBtn: Button = findViewById(R.id.generateBtn)
        val tableText: TextView = findViewById(R.id.tableTextView)

        generateBtn.setOnClickListener {
            val no: Int = number.text.toString().toInt()
            tableText.text = ""
            var table: String = ""
            for (i in 1..10) {
                table += "$no X $i = ${no * i}\n"
            }
            tableText.text = table
        }
    }
}