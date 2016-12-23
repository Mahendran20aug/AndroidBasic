package com.example.mahendran.test.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mahendran.test.ListViewImageTest1;
import com.example.mahendran.test.R;

import java.util.ArrayList;

/**
 * Created by Mahendran on 17-10-2016.
 */

public class ArraryAdaptor extends BaseAdapter {
    private ArrayList<Listviewmodel> myarrayList;
    private Context context;



    public ArraryAdaptor(Context context, ArrayList<Listviewmodel> myarrayList) {
        this.myarrayList = myarrayList;
        this.context = context;
    }
    @Override
    public int getCount() {
        return myarrayList.size() ;
    }
    @Override
    public Object getItem(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.single_listview_image_test1,parent,false);
        ImageView myImage= (ImageView) row.findViewById(R.id.imvcar);
        TextView myTitle= (TextView) row.findViewById(R.id.tvtitle);
        TextView myDescriptions= (TextView) row.findViewById(R.id.tvdesc);
        Listviewmodel listviewobj = myarrayList.get(position);
        myImage.setImageResource(listviewobj.getImages());
        myTitle.setText(listviewobj.getTitle());
        myDescriptions.setText(listviewobj.getDesc());

        return row;
    }
}
