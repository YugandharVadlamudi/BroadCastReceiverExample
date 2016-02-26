package com.example.kiran.broadcastreceiverexample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

import java.security.Provider;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by Kiran on 19-12-2015.
 */
public class FirstServiece extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service Created", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        super.onStart(intent, startId);
        Toast.makeText(this, "Service stared", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service StartCommand", Toast.LENGTH_SHORT).show();
ThreadClass td=new ThreadClass();
        td.start();
        return super.onStartCommand(intent, flags, startId);

    }
    class ThreadClass extends Thread {
        @Override
        public void run() {
            super.run();
            try {
                sleep(70 * 1000);
                handler.sendEmptyMessage(0);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
    android.os.Handler handler = new android.os.Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
}
