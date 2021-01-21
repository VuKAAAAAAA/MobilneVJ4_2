package com.example.appb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callBroadCast();
    }

    private void callBroadCast(){
        broadcastReciver reciver = new broadcastReciver();
        registerReceiver(reciver,
                new IntentFilter("action"));
    }
}