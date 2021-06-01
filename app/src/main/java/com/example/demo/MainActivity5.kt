package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var TextBox = findViewById<EditText>(R.id.t1)
        var bttn = findViewById<Button>(R.id.b1)
        var resbox = findViewById<TextView>(R.id.t2)

        bttn.setOnClickListener(View.OnClickListener {
            var input: Int = TextBox.text.toString().toInt();
            var i : Int = 1;
            var s :String = " ";
            while(true){
                s += "$i@";
                if(i == input){
                    break;
                }
                ++ i;
            }
            resbox.setText(s);
            TextBox.setText(" ");

        })
    }
}