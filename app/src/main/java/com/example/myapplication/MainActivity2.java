package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout main2;
    private Button isp;
    private Button ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        main2 = findViewById(R.id.main2);
        isp = findViewById(R.id.isp);
        ca = findViewById(R.id.ca);
        isp.setOnClickListener(this);
        ca.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.isp:
                Intent intent = new Intent(this, ReadActivity.class);
                startActivity(intent);
            case R.id.ca:
                Intent intent1 = new Intent(this, MainActivity7.class);
                startActivity(intent1);
        }
    }
}
