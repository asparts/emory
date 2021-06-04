package com.childsplay.emory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class CreditsActivity extends AppCompatActivity {

    Button sendButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        sendButton = findViewById(R.id.sendButton);



        setActionListeners();

    }

    private void setActionListeners(){

    sendButton.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            Intent intent = new Intent(v.getContext(), VideoActivity.class);
            startActivity(intent);

        }
    });

    }



}