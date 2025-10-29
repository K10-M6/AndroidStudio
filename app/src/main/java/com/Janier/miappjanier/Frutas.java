package com.Janier.miappjanier;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Frutas extends AppCompatActivity {
    private MediaPlayer au_apple, au_orange, au_peach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_frutas);
        au_apple = MediaPlayer.create(Frutas.this, R.raw.apple);
        au_orange = MediaPlayer.create(Frutas.this, R.raw.a_orange);
        au_peach = MediaPlayer.create(Frutas.this, R.raw.a_peach);

    }
    public void App(View view){
        au_apple.start();
    }
    public void Orange(View view){
        au_orange.start();
    }
    public void Peach(View view){
        au_peach.start();
    }
}