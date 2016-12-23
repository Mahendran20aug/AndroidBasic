package com.example.mahendran.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
/* Methode 1
public  class ButtononClick extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonon_click);
    }
    public void Method(View view) {
        Toast.makeText(ButtononClick.this, "M1", Toast.LENGTH_SHORT).show();
    }
}
*/

/* Methode 2 */
public class ButtononClick extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private Button B3;
    private Button B5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonon_click);
        Button b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "b5", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void doSomething(View view) {

        int i=view.getId();

        switch (i){

            case R.id.button1:
                Toast.makeText(this, "b1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this, "b2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this, "b3", Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void hghgg(View view) {
        Toast.makeText(this, "hhjxjhx", Toast.LENGTH_SHORT).show();
    }
}

/* Methode 3
public class ButtononClick extends AppCompatActivity  implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonon_click);

        Button b1 = (Button) findViewById(R.id.button1);
        Button b2 = (Button) findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        int id = v.getId();
        if (id == R.id.button1) {
            Toast.makeText(ButtononClick.this,"M1", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.button2) {
            Toast.makeText(ButtononClick.this, "M2", Toast.LENGTH_SHORT).show();
        }
    }
}
*/





















