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
    TextView tv;
    TextView lista;
    String str = SecondActivity.bundle.getString("key");
    //String which_butt_isPressed_for_this_class = SecondActivity.which
    ArrayList<String> selectedItems = (ArrayList<String>)getIntent().getSerializableExtra("Files_to_send");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tv = (TextView) findViewById(R.id.category);
        String sel_cat = getResources().getString(R.string.selected_category);
        tv.setText(sel_cat+str);
        //tv.setText(getIntent().getStringExtra("which_btn_isPressed"));
        lista = findViewById(R.id.selected_products);
        //lista.setText(selectedItems);

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