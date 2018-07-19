package com.example.wajahat.fragmentandadapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemBaseAdapter extends BaseAdapter {
        String[] data={"Wajahat","Hussain"};
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
                TextView textView=new TextView(parent.getContext());
                textView.setText(data[position]);
                return textView;
            }
            else
                return convertView;
    }
}
