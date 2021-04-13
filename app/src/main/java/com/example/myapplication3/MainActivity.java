package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<DramaModel> listDrama = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        listDrama.addAll(DramaData.getListData());
        showRecycleList();
    }

    private void showRecycleList(){
        rv.setLayoutManager(new LinearLayoutManager(this));
        DramaAdapter dramaAdapter = new DramaAdapter(this);
        dramaAdapter.setDramaModels(listDrama);
        rv.setAdapter(dramaAdapter);
    }
}