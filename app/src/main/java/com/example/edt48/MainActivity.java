package com.example.edt48;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<Picture> pictures = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);
        addPics();
        MyAdapter myAdapter = new MyAdapter(this,pictures);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3,
                RecyclerView.VERTICAL, false));
    }

    public void addPics(){
        boolean isEnd = false;
        int count = 1;
        while(!isEnd){
            pictures.add(new Picture("Pic"+count,"https://joanseculi.com/images/img" + (count<=9?"0"+count:count),"desc"));
            count ++;
            if(count==38) isEnd = true;
        }
    }
}