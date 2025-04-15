package com.childsplay.emory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SettingsActivity extends AppCompatActivity {

    ImageButton soundButton;
    ImageButton settingsBackButton;

    Intent fromIntent;

    boolean soundOn = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);


        soundButton = findViewById(R.id.soundButton);
        settingsBackButton = findViewById(R.id.settingsBackButton);

        setActionListeners();
    }

    private void setActionListeners(){

        soundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(soundOn == true){
                    soundOn = false;
                    soundButton.setImageResource(R.drawable.ic_volume_off);
                }else{
                    soundOn = true;
                    soundButton.setImageResource(R.drawable.ic_volume_up);
                }


            }
        });
        settingsBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: Check if u have to pass intent where you came to settings...

            }
        });

    }

}
