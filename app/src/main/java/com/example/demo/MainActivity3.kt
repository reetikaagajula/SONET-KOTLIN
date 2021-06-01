package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var TextBox = findViewById<EditText>(R.id.etext)
        var bttn = findViewById<Button>(R.id.resbut)
        var resbox = findViewById<TextView>(R.id.Tveiw)

        bttn.setOnClickListener(View.OnClickListener {
            var input: Int = TextBox.text.toString().toInt()
            for (item in (1..(input-1)))
                print("$item" +"@");
            print(input)

        })
    }
}