package com.example.wajahat.fragmentandadapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

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
                Context context=parent.getContext();
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
                Button button=new Button(context);
                button.setText(data[position]);
                linearLayout.addView(button);
                return linearLayout;
            }
            else
                return convertView;
    }
}
