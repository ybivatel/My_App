package com.example.myapplication;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.INotificationSideChannel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
    public class MainActivity4 extends AppCompatActivity {
        private EditText edName, edSecName, edEmail;
        private DatabaseReference mDataBase;
        private String USER_KEY = "User";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main4);
            init();
        }
        private void init()
        {
            edName = findViewById(R.id.edName);
            edSecName = findViewById(R.id.edSecName);
            edEmail = findViewById(R.id.edEmail);
            mDataBase = FirebaseDatabase.getInstance().getReference(USER_KEY);
        }

        public void onClickSave(View view)
        {
            String id = mDataBase.getKey();
            String name = edName.getText().toString();
            String sec_name = edSecName.getText().toString();
            String email = edEmail.getText().toString();
            User newUser = new User(id,name,sec_name,email);
            if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(sec_name) && !TextUtils.isEmpty(email) )
            {
                mDataBase.push().setValue(newUser);
                Toast.makeText(this, "Сохранено", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this, "Пустое поле", Toast.LENGTH_SHORT).show();
            }




        }
        public void onClickRead(View view)
        {
            Intent i = new Intent(MainActivity4.this, ReadActivity.class);
            startActivity(i);
        }

    }