package com.example.mahendran.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerTest extends Activity implements AdapterView.OnItemSelectedListener{

    Spinner spinner;
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_test);

        spinner= (Spinner) findViewById(R.id.spinner);

        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,days);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText=(TextView) view;
        Toast.makeText(SpinnerTest.this, "you selected "+myText.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}



     /*  ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,days);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            TextView myText=(TextView) view;
            Toast.makeText(SpinnerTest.this, "you selected"+myText.getText(), Toast.LENGTH_SHORT).show();
            }
        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
        });

        */

