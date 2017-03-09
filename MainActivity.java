package com.example.apoyo03_ui.recyclerviewejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView vertical_recycler_view;
    private ArrayList<String> horizontalList,verticalList;
    private  VerticalAdapter verticalAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vertical_recycler_view = (RecyclerView) findViewById(R.id.vertical_recycler_view);
//        horizontal_recycler_view= (RecyclerView) findViewById(R.id.horizontal_recycler_view);

        verticalList=new ArrayList<>();
        verticalList.add("verticallist 1");
        verticalList.add("verticallist 2");
        verticalList.add("verticallist 3");
        verticalList.add("verticallist 4");
        verticalList.add("verticallist 5");
        verticalList.add("verticallist 6");
        verticalList.add("verticallist 7");
        verticalList.add("verticallist 8");
        verticalList.add("verticallist 9");
        verticalList.add("verticallist 10");

        verticalAdapter = new VerticalAdapter(verticalList, getApplication());

        LinearLayoutManager verticalLayoutmanager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        vertical_recycler_view.setLayoutManager(verticalLayoutmanager);
//        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
//        vertical_recycler_view.setLayoutManager(mLayoutManager);
//
        vertical_recycler_view.setAdapter(verticalAdapter);
//
    }
}
