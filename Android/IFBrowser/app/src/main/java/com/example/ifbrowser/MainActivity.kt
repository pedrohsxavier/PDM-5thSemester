package com.example.ifbrowser

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btIr: Button
    private lateinit var btAtualizar: Button
    private lateinit var etPesquisar: EditText
    private lateinit var wvConteudo: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btIr = findViewById(R.id.btIr)
        this.btAtualizar = findViewById(R.id.btAtualizar)
        this.etPesquisar = findViewById(R.id.etPesquisar)
        this.wvConteudo = findViewById(R.id.wvConteudo)

        wvConteudo.webViewClient = WebViewClient()

        this.btIr.setOnClickListener({ getPage(it) })
    }

    fun getPage(view: View) {
        this.wvConteudo.loadUrl(this.etPesquisar.text.toString())
    }
}
