package com.childsplay.emory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserInterFaceActivity extends AppCompatActivity {

    Button playButton;
    Button settingsButton;
    Button quitButton;
    Button settingsIconButton;
    Button creditsButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_inter_face);

        BackgroundSoundService backgroundSoundService = new BackgroundSoundService(); // Should start playing on oncreate. //TODO: check that this shit works


         playButton = findViewById(R.id.playButton);
         settingsButton = findViewById(R.id.settingsButton);
         quitButton = findViewById(R.id.quitButton);
         settingsIconButton = findViewById(R.id.settingsIconButton);
         creditsButton = findViewById(R.id.creditsButton);


        setActionListeners();
    }



    public void setActionListeners(){

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(v.getContext(), CategoriesActivity.class);
                startActivity(intent);

            }
        });
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Intent intent = new Intent(v.getContext(), SettingsActivity.class);
            startActivity(intent);

            }
        });

        creditsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), CreditsActivity.class);
                startActivity(intent);
            }
        });

        quitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.exit(0);
            }
        });




       /* settingsIconButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), SettingsActivity.class);
                startActivity(intent);

            }
        });*/

    }
}