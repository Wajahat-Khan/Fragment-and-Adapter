package com.example.wajahat.fragmentandadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class ItemBaseAdapter extends BaseAdapter {
        String[] data={"Chicken Burgers","Beef Burgers", "Fish Burgers"};
    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView ==null){
                Context context = parent.getContext();
                LayoutInflater layoutInflater=LayoutInflater.from(context);
                View v= layoutInflater.inflate(R.layout.specific_list,parent,false);
                Button button=(Button) v.findViewById(R.id.specific_button);
                button.setText(data[position]);
                return button;
            }
           else
               return convertView;
    }
}
