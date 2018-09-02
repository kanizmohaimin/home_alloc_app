package com.example.m.project;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class accomodation_detail_2 extends AppCompatActivity {

    private TextView mTextMessage;
    View eco;
    View gen;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    gen.setVisibility(View.GONE);
                    eco.setVisibility(View.VISIBLE);
                    return true;
                case R.id.navigation_dashboard:
//                    mTextMessage.setText(R.string.title_dashboard);
                    gen.setVisibility(View.VISIBLE);
                    eco.setVisibility(View.GONE);
                    return true;
            }
            return false;
        }
    };

    private Button ta;
    private TextView ad;
    private boolean taf = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accomodation_detail_2);
        eco = findViewById(R.id.eco);
        gen = findViewById(R.id.gen);
        gen.setVisibility(View.GONE);
//        mTextMessage = (TextView) findViewById(R.id.message);

        ta = findViewById(R.id.ta);
        ad = findViewById(R.id.tad);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!taf)
                    ad.setVisibility(View.VISIBLE);
                else
                    ad.setVisibility(View.GONE);
                taf = !taf;
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_home);
    }

}
