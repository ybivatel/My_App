package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout main1;
    private Button student;
    private Button teacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main1 = findViewById(R.id.main1);
        student = findViewById(R.id.student);
        teacher = findViewById(R.id.teacher);
        teacher.setOnClickListener(this);
        student.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.teacher:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
            case R.id.student:
                Intent intent1 = new Intent(this, MainActivity2.class);
                startActivity(intent1);
        }
    }
}
