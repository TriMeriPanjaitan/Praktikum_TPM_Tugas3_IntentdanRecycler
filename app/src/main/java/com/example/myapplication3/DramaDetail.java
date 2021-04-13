package com.example.myapplication3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;

public class DramaDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drama_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Drama ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView ivPhoto = findViewById(R.id.iv_photo);
        TextView tv_name = findViewById(R.id.tv_name);
        TextView tv_deskripsi = findViewById(R.id.tv_deskripsi);

        tv_name.setText(getIntent().getStringExtra("Name"));
        tv_deskripsi.setText("Deskripsi : " + getIntent().getStringExtra("Deskripsi"));

        Glide.with(getApplicationContext())
                .load(getIntent().getIntExtra("photo", 0))
                .into(ivPhoto);


    }
}