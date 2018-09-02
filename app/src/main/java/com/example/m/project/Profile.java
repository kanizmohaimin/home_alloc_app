package com.example.m.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Profile extends AppCompatActivity {



    private Button save,editname;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        name=findViewById(R.id.name);
        save=findViewById(R.id.save);
        editname=findViewById(R.id.editname);

        save.setClickable(false);
        editname.setClickable(false);
        editname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save.setClickable(true);
                editname.setClickable(true);
            }
        });


        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });


    }
}
