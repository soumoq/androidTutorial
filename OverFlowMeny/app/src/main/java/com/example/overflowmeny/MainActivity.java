package com.example.overflowmeny;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        switch (item.getItemId()) {
            case R.id.menuRed:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.menuGreen:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menuBlue:
                if (item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainLayout.setBackgroundColor(Color.BLUE);
                return true;
            default:return  super.onOptionsItemSelected(item);

        }

    }
}