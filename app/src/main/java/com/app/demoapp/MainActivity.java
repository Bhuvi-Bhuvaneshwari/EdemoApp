package com.app.demoapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

        MediaPlayer player;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);

            requestWindowFeature(Window.FEATURE_NO_TITLE);
            this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            Objects.requireNonNull(getSupportActionBar()).hide();

            setContentView(R.layout.activity_main);

            Button btn = findViewById(R.id.emcnum);
            btn.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,EmcNumActivity.class)));

            Button btn1 = findViewById(R.id.tnb);
            btn1.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,MainActivity2.class)));
        }

        public void play(View v)
        {
            if (player == null) {
                player = MediaPlayer.create(this, R.raw.emctone);
                player.setOnCompletionListener(mp -> stopplayer());
            }
            player.setLooping(true);
            player.start();
            AudioManager player = (AudioManager) getApplicationContext().getSystemService(Context.AUDIO_SERVICE);
            int values = 15;
            player.setStreamVolume(AudioManager.STREAM_MUSIC,values,0);
        }

        public void stop(View v){
        stopplayer();

    }

        private void stopplayer ()
        {
            if (player != null) {
                player.release();
                player = null;
            }
        }

        @Override
        protected void onStop()
        {
            super.onStop();
            stopplayer();
        }

    }