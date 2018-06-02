package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ThirdActivityVeget extends AppCompatActivity {
    Button recipe_but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_veget);

        recipe_but = findViewById(R.id.button6);
        recipe_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ThirdActivityVeget.this, FourthActivity.class);
                startActivity(myIntent);


            }
        });
    }
}
