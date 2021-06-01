package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var TextBox = findViewById<EditText>(R.id.etpn)
        var bttn = findViewById<Button>(R.id.bttn1)
        var resbox = findViewById<TextView>(R.id.veiwtext)

        bttn.setOnClickListener(View.OnClickListener {
            var input: Int = TextBox.text.toString().toInt()
            for (item in (1..input)) {
                resbox.setText("$item" + "@");
            }

        })
    }
}