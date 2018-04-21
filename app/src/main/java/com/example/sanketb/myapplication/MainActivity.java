package com.example.sanketb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// MainActvity Class  

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        // This is the line thats used to load ui interface on screen
        setContentView(R.layout.activity_main);
        
    }
}
