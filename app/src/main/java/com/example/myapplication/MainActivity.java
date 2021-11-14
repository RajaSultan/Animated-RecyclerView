package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Travel> travels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        recyclerView = findViewById(R.id.recView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        travels.add(new Travel(R.drawable.img_1, "Destination 1"));
        travels.add(new Travel(R.drawable.img_2, "Destination 2"));
        travels.add(new Travel(R.drawable.img_3, "Destination 3"));
        travels.add(new Travel(R.drawable.img_4, "Destination 4"));
        travels.add(new Travel(R.drawable.img_1, "Destination 1"));
        travels.add(new Travel(R.drawable.img_2, "Destination 2"));
        travels.add(new Travel(R.drawable.img_3, "Destination 3"));
        travels.add(new Travel(R.drawable.img_4, "Destination 4"));
        travels.add(new Travel(R.drawable.img_1, "Destination 1"));
        travels.add(new Travel(R.drawable.img_2, "Destination 2"));
        travels.add(new Travel(R.drawable.img_3, "Destination 3"));
        travels.add(new Travel(R.drawable.img_4, "Destination 4"));
        AdapterClass adapterClass = new AdapterClass(travels, this);
        recyclerView.setAdapter(adapterClass);
    }
}