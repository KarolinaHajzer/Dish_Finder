package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button carnivore_but;
    Button vegetarian_but;
    Button vegan_but;
    public static Bundle bundle = new Bundle();
    //public String which_btn_isPressed;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        carnivore_but = findViewById(R.id.button2);
        carnivore_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SecondActivity.this, ThirdActivityCarni.class);
                //which_btn_isPressed = "carnivore";
                SecondActivity.bundle.putString("key","carnivore");
                //myIntent.putExtra("which_btn_isPressed","carnivore");
                startActivity(myIntent);

            }
        });

        vegetarian_but = findViewById(R.id.button3);
        vegetarian_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SecondActivity.this, ThirdActivityVeget.class);
                //which_btn_isPressed = "vegetarian";
                //myIntent.putExtra("which_btn_isPressed","vegetarian");
                SecondActivity.bundle.putString("key","vegetarian");
                startActivity(myIntent);

            }
        });

        vegan_but = findViewById(R.id.button4);
        vegan_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SecondActivity.this, ThirdActivityVegan.class);
                //which_btn_isPressed = "vegan";
                //myIntent.putExtra("which_btn_isPressed","vegan");
                SecondActivity.bundle.putString("key","vegan");
                startActivity(myIntent);
            }
        });
    }
}
