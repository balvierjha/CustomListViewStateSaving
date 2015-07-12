package com.globalspace.bslvir.globalspaceassignment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    ListView listOfItems;
    ArrayList<ProductItems> listItems;
    ListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listOfItems = (ListView) findViewById(R.id.listOfItems);
        listItems = new ArrayList<ProductItems>();
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a6000", "Not Available", " ", true));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        listItems.add(new ProductItems("Lenovo a7000", "Available", "", false));
        adapter = new ListAdapter(this, listItems);
        listOfItems.setAdapter(adapter);
    }

}
