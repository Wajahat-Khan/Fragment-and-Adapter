package com.example.wajahat.fragmentandadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetailAdapter extends BaseAdapter {
    String[] titles={"Chicken Burgers","Beef Burgers", "Fish Burgers"};
    String[] description={"Chicken Burger very good" ,"Beef Burger very good", "Fish Burger very good"};
    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return titles[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView ==null) {
            Context context = parent.getContext();
            LayoutInflater layoutInflater=LayoutInflater.from(context);
            View v= layoutInflater.inflate(R.layout.detail_list,parent,false);
            ImageView imageView=(ImageView) v.findViewById(R.id.food_image);
            imageView.setImageResource(R.drawable.burger1);
            TextView t=(TextView) v.findViewById(R.id.tt);
            t.setText(titles[position]);
            TextView d=(TextView) v.findViewById(R.id.description);
            d.setText(description[position]);
            return v;
           }
        else
            return convertView;
    }
}
