package com.example.service;

import android.app.Service;
import android.content.Intent;

import android.os.Binder;
import android.os.IBinder;
import android.view.View;


import androidx.annotation.Nullable;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MyService extends Service {
    private final IBinder myBinder = new MyLocalBinder();


    public MyService() {

    }

    public class MyLocalBinder extends Binder {
        MyService getService() {
            return MyService.this;
        }

    }

    public String getCurrentTime() {
        Date currentTime = Calendar.getInstance().getTime();
        return ("abc");
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return myBinder;
    }


}