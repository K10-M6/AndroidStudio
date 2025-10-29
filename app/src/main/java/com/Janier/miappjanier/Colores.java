package com.Janier.miappjanier;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Colores extends AppCompatActivity {
    private MediaPlayer au_red, au_black, au_white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_colores);
        au_red = MediaPlayer.create(Colores.this,R.raw.red);
        au_black = MediaPlayer.create(Colores.this,R.raw.black);
        au_white = MediaPlayer.create(Colores.this,R.raw.white);
    }
    public void White(View view){
        au_white.start();
    }
    public void Red(View view){
        au_red.start();
    }
    public void Black(View view){
        au_black.start();
    }
}