package com.example.mahendran.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExpilcitInstents extends Activity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expilcit_instents);
        b = (Button) findViewById(R.id.button1);
    }
    public void doSomething(View view) {
        Intent intent=new Intent(this,ExplicitInstents1.class);
        startActivity(intent);
    }
}
