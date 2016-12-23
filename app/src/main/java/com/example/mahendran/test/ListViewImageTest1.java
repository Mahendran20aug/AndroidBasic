package com.example.mahendran.test;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mahendran.test.model.ArraryAdaptor;
import com.example.mahendran.test.model.Listviewmodel;

import java.util.ArrayList;

public class ListViewImageTest1 extends AppCompatActivity {

    ListView list;

    ArrayList<Listviewmodel> myarrayList;

   /*int[] images = {R.drawable.car, R.drawable.capitan, R.drawable.hulk, R.drawable.iron, spider,
            R.drawable.thor, R.drawable.hero7, R.drawable.hero8, R.drawable.hero9, R.drawable.hero10};
    private String[] numberTitle = {"1","2","3","4","5","6","7","8","9","10"};
    private String[] numberDescriptions = {"car","capitan","hulk","iron","spider","thor","hero7","hero8","hero9","hero10"}; */






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_image_test1);
        myarrayList=new ArrayList<Listviewmodel>();
        myarrayList.add(new Listviewmodel(R.drawable.car,"title 1","desc1"));
        myarrayList.add(new Listviewmodel(R.drawable.capitan,"title 1","desc1"));
        myarrayList.add(new Listviewmodel(R.drawable.hulk,"title 1","desc1"));
        myarrayList.add(new Listviewmodel(R.drawable.thor,"title 1","desc1"));
        myarrayList.add(new Listviewmodel(R.drawable.spider,"title 1","desc1"));



        list = (ListView) findViewById(R.id.lvtemp);
       // Test1 adapter=new Test1(this, numberTitle, images, numberDescriptions);
       // Test1 adapter=new Test1(this,myarrayList );
        ArraryAdaptor adp=new ArraryAdaptor(this,myarrayList );
        list.setAdapter(adp);


        Log.d("dddgsdcghudf", "onCreate: "+myarrayList.size());
    }
}

class Test1 extends ArrayAdapter<String>
{

    private  ArrayList<Listviewmodel> listviewmo;
    private Context context;

    Test1(Context context, ArrayList<Listviewmodel> listviewmodels){
        super(context,R.layout.single_listview_image_test1);

            this.listviewmo=listviewmodels;
            this.context=context;
    }


    /*int[] images;
   // String[] titleArray;
   // String[] descriptionsArray;

    Test1(Context c,String[] titles, int[] imgs, String[] desc)
    {
        super(c,R.layout.single_listview_image_test1,titles);
        this.context=c;
        this.images=imgs;
        this.titleArray=titles;
        this.descriptionsArray=desc;
    } */



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.single_listview_image_test1,parent,false);
        ImageView myImage= (ImageView) row.findViewById(R.id.imvcar);
        TextView myTitle= (TextView) row.findViewById(R.id.tvtitle);
        TextView myDescriptions= (TextView) row.findViewById(R.id.tvdesc);

        //myImage.setImageResource(images[position]);
        //myTitle.setText(titleArray[position]);
        //myDescriptions.setText(descriptionsArray[position]);
        Listviewmodel listviewobj = listviewmo.get(position);
        myImage.setImageResource(listviewobj.getImages());
        myTitle.setText(listviewobj.getTitle());
        myDescriptions.setText(listviewobj.getDesc());

        return row;
    }
}



