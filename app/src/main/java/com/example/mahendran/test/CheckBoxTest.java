package com.example.mahendran.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxTest extends Activity implements View.OnClickListener{

    CheckBox c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_test);
        c= (CheckBox) findViewById(R.id.checkBox);
        c.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        CheckBox t = (CheckBox) v;
        if (t.isChecked())
        {
            Toast.makeText(this,"yes i want pizza",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"no i don't pizza",Toast.LENGTH_SHORT).show();
        }
    }
}
