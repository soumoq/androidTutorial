package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import com.example.service.MyService.MyLocalBinder;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

import java.security.Provider;

public class MainActivity extends AppCompatActivity {

    MyService myService;
    boolean isBound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=new Intent(this,MyService.class);
        bindService(i,myConnection, Context.BIND_AUTO_CREATE);


    }

    private ServiceConnection myConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            MyLocalBinder binder = (MyLocalBinder) service;
            myService = binder.getService();
            isBound =true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            isBound=false;
        }
    };

    public void showTime(View view)
    {
        String time=myService.getCurrentTime();
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText(time);
    }
}