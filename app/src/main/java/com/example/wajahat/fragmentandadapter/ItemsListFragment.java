package com.example.wajahat.fragmentandadapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class ItemsListFragment extends Fragment {
    public ItemsListFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View list=inflater.inflate(R.layout.items_list,container,false);
        ListView l= (ListView) list.findViewById(R.id.list);
        TextView textView=new TextView(getContext());
        textView.setText("yes");
        l.addView(textView);
        return list;
    }
}
