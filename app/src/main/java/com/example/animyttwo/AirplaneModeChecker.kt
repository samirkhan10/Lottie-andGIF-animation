package com.example.animyttwo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChecker:BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isPlaneModeEnable = intent?.getBooleanExtra("state",false)?:return
        if (isPlaneModeEnable){
            Toast.makeText(context,"Airplane Mode Enabled",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Airplane Mode Disabled",Toast.LENGTH_LONG).show()
        }
    }
}