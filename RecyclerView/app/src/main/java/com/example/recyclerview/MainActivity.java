package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_ber);
        //getSupportActionBar().setElevation(0);
        View view = getSupportActionBar().getCustomView();



        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_background, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));
        exampleList.add(new ExampleItem(R.drawable.ic_launcher_foreground, "Soumojyoti", "+917477540554"));



        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).color(Color.BLACK).build());
    }
}


/*
this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
      getSupportActionBar().setDisplayShowCustomEnabled(true);
      getSupportActionBar().setCustomView(R.layout.custom_action_bar);
      //getSupportActionBar().setElevation(0);
      View view = getSupportActionBar().getCustomView();
*/