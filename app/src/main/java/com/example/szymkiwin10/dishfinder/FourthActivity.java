package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {
    Button try_again_but;
    TextView tv,lista,recipess;
    String str = SecondActivity.bundle.getString("key");
    String recipes_carnivore = ThirdActivityCarni.bundle.getString("all_recipes_carni");
    String recipes_vegetarian = ThirdActivityVeget.bundle.getString("all_recipes_vegetarian");
    String recipes_vegan = ThirdActivityVegan.bundle.getString("all_recipes_vegan");
    ArrayList<String> list = new ArrayList<>();
    String carnivore_string = "carnivore";
    String vegetarian_string = "vegetarian";
    String vegan_string = "vegan";
    boolean is_carnivore = carnivore_string.equals(str);
    boolean is_vegetarian = vegetarian_string.equals(str);
    boolean is_vegan = vegan_string.equals(str);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        recipess = findViewById(R.id.recipes);

        if (is_carnivore) {
            recipess.setText(recipes_carnivore);
        }
        if (is_vegetarian) {
            recipess.setText(recipes_vegetarian);
        }
        if(is_vegan){recipess.setText(recipes_vegan);}


        tv = findViewById(R.id.category);
        String sel_cat = getResources().getString(R.string.selected_category);
        tv.setText(sel_cat+str);

        lista = findViewById(R.id.selected_products);
        Bundle bundle = getIntent().getExtras();
        ArrayList<String> selectedItems = bundle.getStringArrayList("Files_to_send");

        String sel_prod = getResources().getString(R.string.your_selected_products);
        lista.setText(sel_prod+selectedItems.toString());

        try_again_but = findViewById(R.id.try_again);
        try_again_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(FourthActivity.this, SecondActivity.class);
                startActivity(myIntent);
            }
        });
    }
        }









