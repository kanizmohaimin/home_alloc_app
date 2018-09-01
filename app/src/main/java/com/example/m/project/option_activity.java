package com.example.m.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class option_activity extends AppCompatActivity {
    Button pb;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.option_page);
        pb=(Button)findViewById(R.id.profile);
        pb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity();

            }
        });
    }

    public void openactivity() {

        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
