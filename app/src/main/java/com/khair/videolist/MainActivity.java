package com.khair.videolist;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList< HashMap<String,String>>arrayList=new ArrayList<>();

    HashMap<String,String>hashMap=new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList();

         listView = findViewById(R.id.listView);
         MyAdapter myAdapter=new MyAdapter();
         listView.setAdapter(myAdapter);



    }
  //===============================================================================================
    public class MyAdapter extends BaseAdapter{


      @Override
      public int getCount() {

          return arrayList.size();
      }

      @Override
      public Object getItem(int position) {

          return null;
      }

      @Override
      public long getItemId(int position) {

          return 0;
      }

      @Override
      public View getView(int position, View convertView, ViewGroup parent) {
          LayoutInflater layoutInflater= (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View myView=layoutInflater.inflate(R.layout.layout,parent,false);

        TextView textView=myView.findViewById(R.id.textView);
          TextView textView2=myView.findViewById(R.id.textView2);

         hashMap=arrayList.get(position);
         String string1=hashMap.get("name");
          String string=hashMap.get("mobile");

          textView.setText(string1);
          textView2.setText(string);


          return myView;
      }
  }

///=======================================================================================================
    public void ArrayList(){

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);


        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);

        hashMap=new HashMap<>();
        hashMap.put("name","Abul khair");
        hashMap.put("mobile","01926100040");
        arrayList.add(hashMap);



    }



  ////==================================================================================================

    }