package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class FourthActivity extends AppCompatActivity {
    Button try_again_but;
    TextView tv,lista,recipes;
    String str = SecondActivity.bundle.getString("key");
    ArrayList<String> list = new ArrayList<>();

    private DatabaseReference mDatabase;
    private String category;
    private ListView mListView;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv = findViewById(R.id.category);
        String sel_cat = getResources().getString(R.string.selected_category);
        tv.setText(sel_cat+str);

        lista = findViewById(R.id.selected_products);
        Bundle bundle = getIntent().getExtras();
        ArrayList<String> selectedItems = bundle.getStringArrayList("Files_to_send");
        String sel_prod = getResources().getString(R.string.your_selected_products);
        lista.setText(sel_prod+selectedItems.toString());

        recipes = findViewById(R.id.recipes);
        //mListView = findViewById(R.id.list_view_for_recipes);

        DatabaseReference categoryRef = FirebaseDatabase.getInstance().getReference("category");
        DatabaseReference carnivoreRef = categoryRef.child("carnivore").child("recipe").child("ingredients");
        DatabaseReference vegetarianRef = categoryRef.child("vegetarian").child("recipe").child("ingredients");
        DatabaseReference veganRef = categoryRef.child("vegan").child("recipe").child("ingredients");

        carnivoreRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.i(TAG, dataSnapshot.getValue(String.class));
                //String value_carnovore = dataSnapshot.getValue(String.class);
                //recipes.setText(value_carnovore.toString());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(TAG, "onCancelled", databaseError.toException());
            }
        });

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