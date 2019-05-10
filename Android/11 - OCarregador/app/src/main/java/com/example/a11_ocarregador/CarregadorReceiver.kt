package com.example.a11_ocarregador

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class CarregadorReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent.action == Intent.ACTION_POWER_CONNECTED) {
            Toast.makeText(context, "Quíí bom", Toast.LENGTH_SHORT).show()
        }else {
            Toast.makeText(context, "Êêêêita", Toast.LENGTH_SHORT).show()
        }
    }
}