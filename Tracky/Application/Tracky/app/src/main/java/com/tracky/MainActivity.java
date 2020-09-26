package com.tracky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
    }

    protected void onDevModePressed(){
        Intent intent = new Intent(this,TestActivity.class);
        startActivity(intent);
    }
}