package com.example.m.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login_activity extends AppCompatActivity {
    private Button eloginbtn;
    private EditText eusername;
    private EditText epassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_signup);
        eloginbtn=(Button) findViewById(R.id.loginbtn);
        eusername=(EditText) findViewById(R.id.username);
        epassword=(EditText) findViewById(R.id.password);
    }

    public void log(View view){
        Intent intent2=new Intent(this,option_activity.class);
        startActivity(intent2);
    }
}
