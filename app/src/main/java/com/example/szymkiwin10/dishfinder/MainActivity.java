package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button intro_but;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intro_but = findViewById(R.id.button);
        intro_but.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                 Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                 startActivity(myIntent);
             }
         });
    }
}
