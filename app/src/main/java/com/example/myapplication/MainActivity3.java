package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout main3;
    private Button isp2;
    private Button ca2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        main3 = findViewById(R.id.main3);
        isp2 = findViewById(R.id.isp2);
        ca2 = findViewById(R.id.ca2);
        isp2.setOnClickListener(this);
        ca2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.isp2:
                Intent intent = new Intent(this, MainActivity4.class);
                startActivity(intent);
            case R.id.ca2:
                Intent intent1 = new Intent(this, MainActivity6.class);
                startActivity(intent1);
        }
    }
}
