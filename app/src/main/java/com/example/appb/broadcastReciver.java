package com.example.appb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class broadcastReciver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent)
    {

        if (intent != null)
        {
            String sIntentAction = intent.getAction();
            if (sIntentAction != null && sIntentAction.equals("action"))
            {
                String data = intent.getStringExtra("TEXT").trim();
                Toast.makeText(context, data, Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(context,"Something went wrong",Toast.LENGTH_SHORT).show();
            }
        }

    }
}