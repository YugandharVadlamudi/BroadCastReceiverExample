package com.example.kiran.broadcastreceiverexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
BroadcastReceiver broadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start).setOnClickListener(this);
        findViewById(R.id.stop).setOnClickListener(this);
    }
    private Intent inetnt;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                if(this.startService(new Intent(getApplicationContext(),FirstServiece.class)) != null) {
                    Toast.makeText(getBaseContext(), "Service is already running", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getBaseContext(), "There is no service running, starting service..", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.stop:
                stopService(new Intent(this,FirstServiece.class));
                break;
        }
    }

}
