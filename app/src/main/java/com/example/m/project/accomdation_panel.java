package com.example.m.project;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class accomdation_panel extends Activity {
    Button ka;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomdation_panel);
        ka=(Button)findViewById(R.id.ta5);
        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity5();

            }
        });


    }


    public void openactivity5() {

        Intent intent = new Intent(this, accomodation_detail_2.class);
        startActivity(intent);


    }

}
