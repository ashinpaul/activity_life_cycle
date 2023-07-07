package com.example.actlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle app","onCreate()");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("Lifecycle app","onStart");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("Lifecycle app","onStop");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("Lifecycle app","onDestroy");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("Lifecycle app","onDestroy");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("Lifecycle app","onPause");
    }
}