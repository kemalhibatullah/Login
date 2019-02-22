package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hello extends AppCompatActivity {

    TextView username;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.utama);

        username = (TextView)findViewById(R.id.masuk1);

        name = getIntent().getStringExtra("value");

        username.setText(name);
    }
}
