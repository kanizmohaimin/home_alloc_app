package com.example.m.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class accomodationform extends AppCompatActivity {


    private Button Submit;
    private EditText name,number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodationform);


        Submit=(Button) findViewById(R.id.submit);
        name = (EditText)findViewById(R.id.name);
        number = (EditText)findViewById(R.id.contactnumber);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("") || number.getText().toString().equals("") || number.getText().toString().length()<11) {
                    Toast.makeText(accomodationform.this,"Succesfully Submitted.Email will be sent within 48 hours",Toast.LENGTH_SHORT).show();
                }
                 else {
                    Toast.makeText(accomodationform.this,"enter data correctly",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
