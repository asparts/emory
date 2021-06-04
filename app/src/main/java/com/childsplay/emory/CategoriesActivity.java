package com.childsplay.emory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity {


    Button animalsCategoryButton, vehiclesCategoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        animalsCategoryButton = findViewById(R.id.animalsCategoryButton2);
        vehiclesCategoryButton = findViewById(R.id.vehiclesCategoryButton);

        setOnClickListeners();

    }

    public void setOnClickListeners(){

         animalsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("categ", "categ");

                Intent intent = new Intent(v.getContext(), MainActivity.class);
                intent.putExtra("Category", "animals");
                startActivity(intent);
            }
        });

        vehiclesCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), MainActivity.class);
                intent.putExtra("Category", "vehicles");
                startActivity(intent);
            }
        });

    }
}