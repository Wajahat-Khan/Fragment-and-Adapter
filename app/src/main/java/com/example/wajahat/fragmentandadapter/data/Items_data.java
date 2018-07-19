package com.example.wajahat.fragmentandadapter.data;

import java.util.ArrayList;
import java.util.List;

public class Items_data {
    private String name;
    private int price;
    private String description;
    private static List<Items_data> items = new ArrayList<Items_data>();

    public Items_data(String name, int price, String description){
        this.name=name;
        this.price=price;
        this.description=description;
        items.add(this);
    }
    public static List<Items_data> getItems(){
        return items;
    }

}
