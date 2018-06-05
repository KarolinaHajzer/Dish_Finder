package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ThirdActivityCarni extends AppCompatActivity {
    Button recipe_but;
    public static ArrayList<String> selectedItems=new ArrayList<>();
    //public  ArrayList<String> getArrayList() { return selectedItems; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_carni);

        ListView ch1=(ListView) findViewById(R.id.checkable_list);
        ch1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        String[] items={"beef","chicken","pork","shrimps","tofu","eggs","milk","butter","apple","asparagus","avocado","banana","bean","berries","broccoli","carrot","cauliflower","chickpeas","corn","cucumber","garlic","kale","leek","lentil","mango"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.rowlayout,R.id.txt_lan,items);
        ch1.setAdapter(adapter);
        ch1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem=((TextView)view).getText().toString();
                if(selectedItems.contains(selectedItem)){
                    selectedItems.remove(selectedItem);
                }
                else{
                    selectedItems.add(selectedItem);
                }
            }
        });

        recipe_but = (Button) findViewById(R.id.button5);
        recipe_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ThirdActivityCarni.this, FourthActivity.class);
                startActivity(myIntent);


            }
        });
    }

}
