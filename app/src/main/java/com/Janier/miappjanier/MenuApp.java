package com.Janier.miappjanier;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuApp extends AppCompatActivity {
    private MediaPlayer au_buttonsounds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_app);
        au_buttonsounds = MediaPlayer.create(MenuApp.this,R.raw.buttonsounds);
    }

    public void irColores(View view){
        au_buttonsounds.start();
        Intent Colores = new Intent( MenuApp.this, Colores.class);
        startActivity(Colores);
    }
    public void irAnimales(View view){
        au_buttonsounds.start();
        Intent Animales = new Intent( MenuApp.this, Animales.class);
        startActivity(Animales);
    }

    public void irNumeros(View view){
        au_buttonsounds.start();
        Intent Numeros = new Intent( MenuApp.this, Numeros.class);
        startActivity(Numeros);
    }

    public void irFrutas(View view){
        au_buttonsounds.start();
        Intent Frutas = new Intent( MenuApp.this, Frutas.class);
        startActivity(Frutas);
    }
    public void Jugar(View view){
        au_buttonsounds.start();
        Intent Pregunta1 = new Intent(MenuApp.this, Pregunta1.class);
        startActivity(Pregunta1);
    }
}