package com.example.a06_olistador

import java.util.*

class IFPB {
    private lateinit var lista ArrayList<Campus>

    constructor() {
        this.lista = ArrayList<Campus>()
        this.loadCampi()
        Collections.sort(this.lista)
    }

    private fun loadCampi() {
        this.lista.add(Campus("João Pessoa", "http:www.ifpb.edu.br/joaopessoa"))
        this.lista.add(Campus("Campina Grande", "http:www.ifpb.edu.br/campinagrande"))
        this.lista.add(Campus("Cajazeiras", "http:www.ifpb.edu.br/cajazeiras"))
        this.lista.add(Campus("Cabedelo", "http:www.ifpb.edu.br/cabedelo"))
    }

    fun get(): ArrayList<Campus> {
        return this.lista
    }

    fun get(index: Int): Campus {
        return this.lista.get(index)
    }
}