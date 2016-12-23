package com.example.mahendran.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.layout.simple_list_item_1;

public class ListViewTest extends Activity implements AdapterView.OnItemClickListener {

    ListView l;
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_test);
        l= (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,simple_list_item_1,days);
        l.setAdapter(adapter);
        l.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        TextView temp = (TextView) view;
        Toast.makeText(this,temp.getText()+""+i,Toast.LENGTH_SHORT).show();
    }
}
