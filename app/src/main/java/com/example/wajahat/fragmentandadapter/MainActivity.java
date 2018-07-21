package com.example.wajahat.fragmentandadapter;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ItemsListFragment itemsListFragment=new ItemsListFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.left_frame,itemsListFragment).commit();

        ItemDetailFragement itemDetailFragement=new ItemDetailFragement();
        fragmentManager.beginTransaction().add(R.id.right_frame,itemDetailFragement).commit();

    }
}
