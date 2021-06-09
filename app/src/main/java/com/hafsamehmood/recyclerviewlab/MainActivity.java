package com.hafsamehmood.recyclerviewlab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.hafsamehmood.recyclerviewlab.Adapter.RecyclerViewAdapter;
import com.hafsamehmood.recyclerviewlab.model.student;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
protected List<student> studentlist= new ArrayList<>();
    RecyclerViewAdapter recyclerviewadapter;
    RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentlist.add(new student("Muneeb ul Hassan","191079"));
        studentlist.add(new student("Bilal Mughal","191069"));
        studentlist.add(new student("Adil shah","196631"));
        studentlist.add(new student("Armaan nawaz","191629"));
        studentlist.add(new student("Asghar Ali","191541"));
        recyclerviewadapter= new RecyclerViewAdapter(MainActivity.this,studentlist);
        recyclerview= findViewById(R.id.recyclerView);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(recyclerviewadapter);
    }
}