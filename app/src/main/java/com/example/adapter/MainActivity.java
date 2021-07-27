 package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
ListView listView;
ArrayList<ItemModel> userlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);
        userlist=new ArrayList<>();
userlist.add(new ItemModel("5464656",R.drawable.book));
        userlist.add(new ItemModel("65161",R.drawable.cam));
        userlist.add(new ItemModel("896545",R.drawable.plant));
        userlist.add(new ItemModel("6431536",R.drawable.images));
        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(),R.layout.arrat_listview,userlist);
        listView.setAdapter(arrayAdapter);
    }

}