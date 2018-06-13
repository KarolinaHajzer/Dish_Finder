/*package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipesActivity extends AppCompatActivity {
    String[] recipe1_carnivore = {"chorizo","tomatoe","beans","pesto"};
    //public ArrayList<String> recipe1_carnivore = new ArrayList<>(Arrays.asList("chorizo","tomatoe","beans","pesto"));
    public String recipe1_carnivore_description = "descr for recipe 1 carnivore";
    public List<String> recipe1_vegan = new ArrayList<>(Arrays.asList("rice","oil","onion","tomatoe","eggplant","curry","chickpeas","basil"));
    public String recipe1_vegan_description = "descr for recipe 1 vegan";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        Intent intent = new Intent(this, FourthActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("recipe1_carnivore", recipe1_carnivore);
        intent.putExtras(bundle);
        this.startActivity(intent);

    }
}*/
