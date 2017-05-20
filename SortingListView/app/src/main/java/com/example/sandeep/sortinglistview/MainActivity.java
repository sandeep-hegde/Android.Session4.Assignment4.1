
//Android Developer Training Session 4 - Assignment 4.1
//Problem Statement- Implement ascending and descending of data loaded in ListView.


package com.example.sandeep.sortinglistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //Implement Buttons and ListView in activity_main.xml and initialize them.
    //Implement the data source in the form of Array list.

    Button ascendingButton, descendingButton;
    ListView list;
    ArrayList<String> months = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialization of Buttons and ListView
        ascendingButton = (Button) findViewById(R.id.button_asc);
        descendingButton = (Button) findViewById(R.id.button_dsc);
        list = (ListView) findViewById(R.id.listView);


        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        //Implement the adapter to bind the data and to view it on ListView

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, months);
        list.setAdapter(adapter);


        //Methods for the sorting of ListView in ascending and descending order

        ascendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(months);
                adapter.notifyDataSetChanged();

            }
        });
        descendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Collections.sort(months, Collections.reverseOrder());
                adapter.notifyDataSetChanged();

            }
        });

    }
}
