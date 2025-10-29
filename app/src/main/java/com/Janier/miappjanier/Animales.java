package com.Janier.miappjanier;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animales extends AppCompatActivity {
    private MediaPlayer au_tiger, au_croco, au_mingo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_animales);
        au_croco = MediaPlayer.create(Animales.this, R.raw.crocodile);
        au_tiger = MediaPlayer.create(Animales.this, R.raw.tiger);
        au_mingo = MediaPlayer.create(Animales.this, R.raw.flamingoooooooooo);

    }
    public void TigerS(View view){
        au_tiger.start();
    }
    public void CrocoS(View view){
        au_croco.start();
    }
    public void MingoS(View view){
        au_mingo.start();
    }
}