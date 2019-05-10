package com.example.a09_ochamadordologador

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvUsuario: TextView
    val LOGADOR = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent("O_LOGADOR")
        startActivityForResult(intent, LOGADOR)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == LOGADOR) {
                setContentView(R.layout.activity_main)
                this.tvUsuario = findViewById(R.id.tvUsuario)

                val st = data?.getStringExtra("LOGIN")
                this.tvUsuario.text = st
            }
        }else {
            finish()
        }
    }
}
