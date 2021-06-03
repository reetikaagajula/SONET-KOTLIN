package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
fun add(a:Int,b:Int):Int = a + b;
fun diff(a:Int,b:Int):Int = a - b;
fun prod(a:Int,b:Int):Int = a * b;
fun quo(a:Int,b:Int):Int = a / b;
class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        var v1 = findViewById<EditText>(R.id.e_4)
        var v2 = findViewById<EditText>(R.id.ee_4)
        var spin3 = findViewById<Spinner>(R.id.sp_6)
        var btn = findViewById<Button>(R.id.b_4)
        var fres = findViewById<TextView>(R.id.tvv_4)
        btn.setOnClickListener(View.OnClickListener {
            var op : String = spin3.selectedItem.toString()
            var x1 :Int = v1.text.toString().toInt()
            var x2 :Int = v2.text.toString().toInt()
            var answer : Int
            when(op){
                "+" -> {
                    answer = add(x1,x2);
                    fres.setText("$answer");
                    //fres.setText(" ");
                }
                "-" -> {
                    answer = diff(x1,x2);
                    fres.setText("$answer");
                    //fres.setText(" ");
                }
                "*" -> {
                    answer = prod(x1,x2);
                    fres.setText("$answer");
                    //fres.setText(" ");
                }
                "/" -> {
                    answer = quo(x1,x2);
                    fres.setText("$answer");
                    //fres.setText(" ");
                }
            }
            //fres.setText(" ");

        })
    }
}