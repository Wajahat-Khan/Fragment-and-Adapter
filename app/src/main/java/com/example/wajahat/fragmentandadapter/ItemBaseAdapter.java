package com.example.wajahat.fragmentandadapter;

import android.content.Context;
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
                Context context=parent.getContext();
               // LinearLayout linearLayout = new LinearLayout(context);
               // linearLayout.setOrientation(LinearLayout.VERTICAL);
                Button button=new Button(context);
                button.setText(data[position]);
                View root= (View) button;
                //ImageView imageView = new ImageView(context);
                //imageView.setImageResource(R.drawable.burger1);

                //linearLayout.addView(button);
                //linearLayout.addView(imageView);
                return root;
            }
           else
               return convertView;
    }
}
