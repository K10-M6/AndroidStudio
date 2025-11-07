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

public class MainActivity extends AppCompatActivity {

    private MediaPlayer au_buttonsounds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        au_buttonsounds = MediaPlayer.create(MainActivity.this,R.raw.buttonsounds);

    }

    public void irMenu(View view){
        au_buttonsounds.start();
        Intent siguiente = new Intent( MainActivity.this, MenuApp.class);
        startActivity(siguiente);
    }

    public void IrJugar(View view){
        au_buttonsounds.start();
        Intent jugar = new Intent(MainActivity.this, Pregunta1.class);
        startActivity(jugar);
    }
}