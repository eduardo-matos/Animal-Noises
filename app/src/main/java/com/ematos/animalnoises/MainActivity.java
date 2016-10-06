package com.ematos.animalnoises;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected MediaPlayer mplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeNoise(View view) {
        String animal = view.getTag().toString();
        int resource_id = getResources().getIdentifier(animal, "raw", getPackageName());

        if(mplayer != null)
            mplayer.stop();

        mplayer = MediaPlayer.create(this, resource_id);
        mplayer.start();
    }
}
