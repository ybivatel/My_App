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

public class MainActivity3 extends AppCompatActivity {
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
    }
    public void addListenerButton(){
        isp2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                        startActivity(intent);
                    }
                }

        );
        ca2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity3.this, MainActivity6.class);
                        startActivity(intent);
                    }
                }

        );
    }
}
