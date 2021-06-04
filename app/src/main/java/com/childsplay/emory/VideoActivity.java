package com.childsplay.emory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView videoView; // for playing animation on submit click

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = (VideoView) findViewById(R.id.videoView);

        playVideo();
    }


    private void playVideo(){


        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);

        String path = "android.resource://"+getPackageName()+"/"+R.raw.kirjevideo;

        Uri uri = Uri.parse(path);

        videoView.setVideoURI(uri);

        videoView.start();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                finish();
            }
        });


    }
}