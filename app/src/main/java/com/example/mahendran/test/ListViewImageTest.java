package com.example.mahendran.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewImageTest extends Activity {

    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        setContentView(R.layout.activity_list_view_image_test);
        l= (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.single_list_view_image_test,R.id.tvtitle,days);
        l.setAdapter(adapter);
    }
}
