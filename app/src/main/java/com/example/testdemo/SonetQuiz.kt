package com.example.testdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SonetQuiz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonet_quiz)
        var q_button = findViewById<Button>(R.id.BuTTonn1)
        var q_name = findViewById<EditText>(R.id.quiz_name)
        q_button.setOnClickListener(View.OnClickListener {
            Log.i("------->","Hello")
            if(q_name.toString().isEmpty()){
                Toast.makeText(this@SonetQuiz,"Please enter name",Toast.LENGTH_LONG).show()
            }
            else{
                var next:Intent = Intent(this,QuizActivity()::class.java)
                startActivity(next)
                finish()
            }
        })
    }
}
