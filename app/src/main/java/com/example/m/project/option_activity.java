package com.example.m.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class option_activity extends AppCompatActivity {
    Button pb,pb1,pb2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_page);
        pb=(Button)findViewById(R.id.profile);
        pb1=(Button)findViewById(R.id.accommodation);
        pb2=(Button)findViewById(R.id.waitinglist);
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();

            }
        });

        pb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity1();

            }
        });
        /*pb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();

            }
        });*/
    }

    public void openactivity() {

        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);


    }

    public void openactivity1() {

        Intent intent = new Intent(this, accomodation_detail_2.class);
        startActivity(intent);}

   /* public void openactivity2() {

        Intent intent = new Intent(this, waitinglist.class);
        startActivity(intent);}*/
}
