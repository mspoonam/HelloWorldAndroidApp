package com.example.sanketb.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.content.Context;


// MainActvity Class  

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        // This is the line thats used to load ui interface on screen
        setContentView(R.layout.activity_main);
        
    }

    public void onGithub(View view){
        Log.d("@poonam inside onGithub", "onGithub: Check if button clicked or not");
        Intent intent = new Intent(getApplicationContext(),WebViewActivity.class);
        intent.putExtra("keyName", "https://github.com/mspoonam");
        startActivity(intent);
    }


    public void onTwitter(View view){
        Log.d("@poonam inside onGithub", "onGithub: Check if button clicked or not");
        Intent intent = new Intent(getApplicationContext(),WebViewActivity.class);
        intent.putExtra("keyName", "https://twitter.com/MsPoonamPandey");
        startActivity(intent);
    }

    public void onLinkedIn(View view){
        Log.d("@poonam inside onGithub", "onGithub: Check if button clicked or not");
        Intent intent = new Intent(getApplicationContext(),WebViewActivity.class);
        intent.putExtra("keyName", "https://www.linkedin.com/in/poonam-pandey-05");
        startActivity(intent);
    }

    public void onInstagram(View view){
        Log.d("@poonam inside onGithub", "onGithub: Check if button clicked or not");
        Intent intent = new Intent(getApplicationContext(),WebViewActivity.class);
        intent.putExtra("keyName", "https://www.instagram.com/poonamp0511/");
        startActivity(intent);
    }


}
