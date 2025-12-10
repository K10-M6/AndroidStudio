package com.Janier.miappjanier;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    Button btnAprender, btnJugar;
    private MediaPlayer au_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        au_sound = MediaPlayer.create(Register.this, R.raw.buttonsounds);
        btnAprender = findViewById(R.id.irAprender);
        btnJugar = findViewById(R.id.irJugar);

        btnAprender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                au_sound.start();
                Intent intentAprender = new Intent(Register.this, MenuApp.class);
                startActivity(intentAprender);
            }
        });

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                au_sound.start();
                Intent intentJugar = new Intent(Register.this, Pregunta1.class);
                startActivity(intentJugar);
            }
        });
    }
}