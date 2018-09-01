package com.example.m.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   private Button mstartbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mstartbtn=(Button)findViewById(R.id.startbtn);
    }

    public void start(View view){
        Intent intent1= new Intent(this,login_activity.class);
        startActivity(intent1);
        //kaniz
    }
}
