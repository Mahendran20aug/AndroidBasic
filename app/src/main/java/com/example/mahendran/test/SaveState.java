package com.example.mahendran.test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SaveState extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_state);
    }

    @Override
    protected void onResume() {
        super.onResume();
        counter++;
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
        Log.d("test1","was saved"+counter);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter=savedInstanceState.getInt("counter");
        Log.d("test1","was restored"+counter);
    }
}
