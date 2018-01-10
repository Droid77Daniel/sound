package com.example.marcoandrei.first_aplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main extends AppCompatActivity {


    Button bt_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        bt_sound=findViewById(R.id.first_button);

        final MediaPlayer sound = MediaPlayer.create(this,R.raw.my_music);

        sound.start();


        bt_sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sound.start();

            }
        });


    }
}
