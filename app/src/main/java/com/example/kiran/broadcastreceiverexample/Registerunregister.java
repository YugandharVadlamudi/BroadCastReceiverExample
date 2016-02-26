package com.example.kiran.broadcastreceiverexample;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Kiran on 19-12-2015.
 */
public class Registerunregister extends Activity
{
    brocastRegisterClass brocast=new brocastRegisterClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }
    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }
    public void registerBroadcastReceiver(View view) {
        this.registerReceiver(brocast,new IntentFilter("android.intent.action.TIME_TICK"));
    }
    public void unregisterBroadcastReceiver(View view) {
        this.unregisterReceiver(brocast);
    }
}
