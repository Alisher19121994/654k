package com.example.a654k

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class BootBroadCast : BroadcastReceiver() {


    override fun onReceive(context: Context?, intent: Intent?) {

        if (Intent.ACTION_BOOT_COMPLETED == intent?.action) {

            val intent = Intent(context, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context?.startActivity(intent)

            Toast.makeText(context, "Boot", Toast.LENGTH_LONG).show()
        }
    }
}