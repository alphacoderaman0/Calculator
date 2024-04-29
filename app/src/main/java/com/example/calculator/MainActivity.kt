package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            // Addition
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val inpOne = findViewById<EditText>(R.id.inpOne)
            val inp1 =  inpOne.text.toString().toInt()

            val inpTwo = findViewById<EditText>(R.id.inpTwo)
            val inp2 =  inpTwo.text.toString().toInt()

            var res = findViewById<TextView>(R.id.txtRes)
            val result = inp1 + inp2
            res.text = "Addition= ${result}"
        }

            // Subtraction
        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener {
            val inpOne = findViewById<EditText>(R.id.inpOne)
            val inp1 =  inpOne.text.toString().toInt()

            val inpTwo = findViewById<EditText>(R.id.inpTwo)
            val inp2 =  inpTwo.text.toString().toInt()

            var res = findViewById<TextView>(R.id.txtRes)
            val result = inp1 - inp2
            res.text = "Subtraction=  ${result}"
        }

//        Multiplication
        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener {
            val inpOne = findViewById<EditText>(R.id.inpOne)
            val inp1 =  inpOne.text.toString().toInt()

            val inpTwo = findViewById<EditText>(R.id.inpTwo)
            val inp2 =  inpTwo.text.toString().toInt()

            var res = findViewById<TextView>(R.id.txtRes)
            val result = inp1 * inp2
            res.text = "Multiply=  ${result}"
        }
// Division
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener {
            val inpOne = findViewById<EditText>(R.id.inpOne)
            val inp1 =  inpOne.text.toString().toInt()

            val inpTwo = findViewById<EditText>(R.id.inpTwo)
            val inp2 =  inpTwo.text.toString().toInt()

            var res = findViewById<TextView>(R.id.txtRes)
            val result = inp1 / inp2
            res.text = "Division=  ${result}"
        }

    }
}