package com.example.dz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.get_random_num)
        val out = findViewById<TextView>(R.id.random_number_result)


        button.setOnClickListener {
            val mean = findViewById<EditText>(R.id.mean_val).text.toString()
            val variance = findViewById<EditText>(R.id.variance_value).text.toString()
            val a : Double = RandomLognormalValue.randomLognormalValue(mean.toDouble(), variance.toDouble())
            out.text = DoubleToTextLocale.convert(a)
        }
    }


}


