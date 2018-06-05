package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class FourthActivity extends AppCompatActivity {
    Button try_again_but;
    //String which_butt_isPressed_for_this_class = SecondActivity.which
    //ArrayList<String> lista = ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        //lista = (ArrayList<String>) findViewById(R.id.checkable_list);

        try_again_but = findViewById(R.id.button8);
        try_again_but.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(FourthActivity.this, SecondActivity.class);
                startActivity(myIntent);

            }
        });
    }

}