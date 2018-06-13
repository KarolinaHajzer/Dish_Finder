package com.example.szymkiwin10.dishfinder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button intro_but;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*public static void file_reader(String[] args) {
            try {
                File f = new File("people.ser");
                Scanner sc = new Scanner(f);

                List<Person> people = new ArrayList<Person>();

                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    String[] details = line.split(":");
                    String gender = details[0];
                    String name = details[1];
                    int age = Integer.parseInt(details[2]);
                    Person p = new Person(gender, name, age);
                    people.add(p);
                }

                for(Person p: people){
                    System.out.println(p.toString());
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }*/






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
