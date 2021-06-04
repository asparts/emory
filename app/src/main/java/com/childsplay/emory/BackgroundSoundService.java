package com.childsplay.emory;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class BackgroundSoundService extends Service {

    MediaPlayer mediaPlayer;

    MediaPlayer menuPlayer;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate(){
        super.onCreate();
        mediaPlayer = MediaPlayer.create(this, R.raw.calmbgm);
        mediaPlayer.setLooping(true);
        mediaPlayer.setVolume(100,100);

        //TODO: check if this actually works
        menuPlayer = MediaPlayer.create(this, R.raw.menuclick);
        //TODO: check menuplayer.start function

    }
    public IBinder onUnBind(Intent arg0) {
        // TO DO Auto-generated method
        return null;
    }

    public void onStop() {

    }
    public void onPause() {

    }
    @Override
    public void onDestroy() {
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    @Override
    public void onLowMemory() {

    }

}
