package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {
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
    }
        public void addListenerButton(){
            isp.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity2.this, ReadActivity.class);
                            startActivity(intent);
                        }
                    }

            );
            ca.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(MainActivity2.this, MainActivity7.class);
                            startActivity(intent);
                        }
                    }

            );
        }
    }
