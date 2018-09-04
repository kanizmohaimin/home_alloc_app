package com.example.m.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class accomodationform extends AppCompatActivity {


    private Button Submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodationform);


        Submit=(Button) findViewById(R.id.submit);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(accomodationform.this,"Succesfully Submitted.Email will be sent within 48 hours",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
