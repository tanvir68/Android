package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ArrayAdapter extends android.widget.ArrayAdapter<ItemModel> {
ArrayList<ItemModel> userList;
Context context;

    public ArrayAdapter(@NonNull Context context, int resource,ArrayList userList) {
        super(context, resource);
        this.context=context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
    LayoutInflater layoutInflater =(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View view= layoutInflater.inflate(R.layout.arrat_listview,null);
        ImageView imageView =view.findViewById(R.id.userimage);
        TextView textView=view.findViewById(R.id.username);
        Button button=view.findViewById(R.id.userbtn);

        ItemModel itemModel =userList.get(position);
        imageView.setImageResource(itemModel.getImgurl());
        textView.setText(itemModel.getName());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum=0;
                String num = itemModel.getName();
                int number = Integer.parseInt(num);
                while (number>0) {
                    int n = number % 10;
                    sum = sum + n;
                    number = number / 10;

                }
                Toast.makeText(context, "sum= "+sum, Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }

    @Override
    public int getCount() {
        return userList.size();
    }
}
