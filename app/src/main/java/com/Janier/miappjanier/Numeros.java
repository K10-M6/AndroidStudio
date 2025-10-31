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

public class Numeros extends AppCompatActivity {
    private MediaPlayer au_one, au_two, au_three, au_four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_numeros);
        au_one = MediaPlayer.create(Numeros.this, R.raw.one );
        au_two = MediaPlayer.create(Numeros.this, R.raw.two );
        au_three = MediaPlayer.create(Numeros.this, R.raw.three );
        au_four = MediaPlayer.create(Numeros.this, R.raw.buttonsounds);
    }
    public void One(View view){
        au_one.start();
    }
    public void Two(View view){
        au_two.start();
    }
    public void Three(View view){
        au_three.start();
    }
    public void Four(View view){
        au_four.start();
    }
}