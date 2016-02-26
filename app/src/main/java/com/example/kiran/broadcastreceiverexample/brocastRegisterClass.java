package com.example.kiran.broadcastreceiverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Kiran on 19-12-2015.
 */
public class brocastRegisterClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        StringBuilder msgStr = new StringBuilder("Current time : ");
        Format formatter = new SimpleDateFormat("hh:mm:ss a");
        msgStr.append(formatter.format(new Date()));
        Toast.makeText(context, msgStr, Toast.LENGTH_SHORT).show();
    }
}
