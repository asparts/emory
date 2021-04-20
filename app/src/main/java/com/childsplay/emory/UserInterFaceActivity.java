package com.childsplay.emory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class UserInterFaceActivity extends AppCompatActivity {

    Button playButton;
    Button settingsButton;
    Button quitButton;
    Button animalsCategoryButton;
    Button vehiclesCategoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_inter_face);

         playButton = findViewById(R.id.playButton);
         settingsButton = findViewById(R.id.settingsButton);
         quitButton = findViewById(R.id.quitButton);
         animalsCategoryButton = findViewById(R.id.animalsCategoryButton);
         vehiclesCategoryButton = findViewById(R.id.vehiclesCategoryButton);

        setActionListeners();
    }



    public void setActionListeners(){

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                setContentView(R.layout.categories);

            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.settings);

            }
        });
        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.exit(0);
            }
        });

        animalsCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

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