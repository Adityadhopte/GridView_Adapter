package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListner{

    RecyclerView recyclerView;
    List<ItemModel> itemModelList;

    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        itemModelList = new ArrayList<>();

        ItemModel item1 = new ItemModel(R.drawable.fruit,"Fruits", "Fresh Fruits From the Graden");
        ItemModel item2 = new ItemModel(R.drawable.beverage,"Apple", "Fresh Fruits From the Graden");
        ItemModel item3 = new ItemModel(R.drawable.bread,"coconut", "Fresh Fruits From the Graden");
        ItemModel item4 = new ItemModel(R.drawable.milk,"banana", "Fresh Fruits From the Graden");
        ItemModel item5 = new ItemModel(R.drawable.popcorn,"mango", "Fresh Fruits From the Graden");
        ItemModel item6 = new ItemModel(R.drawable.vegitables,"watermelon", "Fresh Fruits From the Graden");

        itemModelList.add(item1);
        itemModelList.add(item2);
        itemModelList.add(item3);
        itemModelList.add(item4);
        itemModelList.add(item5);
        itemModelList.add(item6);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new MyAdapter(itemModelList);
        recyclerView.setAdapter(adapter);

        adapter.setClickListner(this);
    }

    @Override
    public void onClick(View v, int position) {
        Toast.makeText(this, "You Choose" + itemModelList.get(position).getItmName(), Toast.LENGTH_SHORT).show();
    }
}