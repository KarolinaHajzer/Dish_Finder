package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThirdActivityCarni extends AppCompatActivity {
    Button recipe_but;
    public static Bundle bundle = new Bundle();
    public ArrayList<String> selectedItems = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ListView ch1 = (ListView) findViewById(R.id.checkable_list);
        ch1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String[] items = {"beef", "chicken", "pork", "shrimps", "eggs", "milk", "butter", "apple", "arugula", "asparagus", "avocado", "banana", "bean", "beetroot", "berries", "broccoli", "cabbage", "carrot", "cauliflower", "chickpeas", "corn", "cucumber", "eggplant", "garlic", "grape", "kale", "leek", "lentil", "mango"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.rowlayout, R.id.txt_lan, items);
        ch1.setAdapter(adapter);
        ch1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = ((TextView) view).getText().toString();
                if (selectedItems.contains(selectedItem)) {
                    selectedItems.remove(selectedItem);
                } else {
                    selectedItems.add(selectedItem);
                }
            }
        });

        recipe_but = findViewById(R.id.button5);
        recipe_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                AssetManager assetManager = getAssets();
                List<String> string_to_send = new ArrayList<>();

                try {
                    InputStream is = assetManager.open("carnivore_recipes.txt");
                    BufferedReader br = new BufferedReader( new InputStreamReader(is));
                    String line = null;
                    while ((line = br.readLine()) != null) {
                        String[] currentLine = line.split(";");
                        String recipe_name = currentLine[0];
                        String recipe_descr = currentLine[1];
                        String recipe_ingred = currentLine[2];
                        String[] recipe_ingred_splited = recipe_ingred.split(",");

                        for (String s:selectedItems) {
                            if(Arrays.asList(recipe_ingred_splited).contains(s)){
                                if (!string_to_send.contains(recipe_name+"\n\n"+recipe_descr+"\n\n"))
                                {
                                    string_to_send.add(recipe_name+"\n\n"+recipe_descr+"\n\n");
                                }}
                                //string_to_send.add(recipe_name+"\n\n"+recipe_descr+"\n\n");}
                        }
                    }
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println(string_to_send.toString());
                Intent myIntent = new Intent(ThirdActivityCarni.this, FourthActivity.class);
                myIntent.putExtra("Files_to_send",selectedItems);
                ThirdActivityCarni.bundle.putString("all_recipes_carni",string_to_send.toString());
                startActivity(myIntent);

            }
        });
    }
}
