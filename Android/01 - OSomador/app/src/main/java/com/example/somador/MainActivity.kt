package com.example.somador

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var etNum1: EditText
    lateinit var etNum2: EditText
    lateinit var tvResultado: TextView
    lateinit var btCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etNum1 = findViewById(R.id.etMainNum1)
        this.etNum2 = findViewById(R.id.etMainNum2)
        this.tvResultado = findViewById(R.id.tvMainResultado)

        this.btCalcular = findViewById(R.id.btMainCalcular)
        this.btCalcular.setOnClickListener({ calcular(it) })
    }

    fun calcular(view: View){
        val n1 = this.etNum1.text.toString().toInt()
        val n2 = this.etNum2.text.toString().toInt()
        this.tvResultado.text = "${ n1 + n2 }"
    }
}
