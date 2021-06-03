package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        var n1 = findViewById<EditText>(R.id.name_6);
        var g1 = findViewById<EditText>(R.id.gender_6);
        var a1 = findViewById<EditText>(R.id.Age_6);
        var buTTon = findViewById<Button>(R.id.inf);
        buTTon.setOnClickListener(View.OnClickListener {
            val person = perSon()
            person.name = n1.text.toString()
            person.gender = g1.text.toString()
            person.age = a1.text.toString().toInt()
            var Result = if (person.age != 0) "${person.name}" else "person is minor"
            Toast.makeText(this, Result, Toast.LENGTH_LONG).show()
        }
        )
    }
}
