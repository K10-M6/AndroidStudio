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

public class Pregunta2 extends AppCompatActivity {
    private MediaPlayer au_correcto, au_incorrecto, au_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_app);
        au_correcto = MediaPlayer.create(Pregunta2.this,R.raw.buttonsounds);
        au_incorrecto = MediaPlayer.create(Pregunta2.this,R.raw.buttonsounds);
        au_text = MediaPlayer.create(Pregunta2.this,R.raw.buttonsounds);
    }

    public void Nice(View view){
        au_correcto.start();
        Intent Pregunta3 = new Intent( Pregunta2.this, Pregunta3.class);
        startActivity(Pregunta3);
    }
    public void Fallo(View view){
        au_incorrecto.start();
    }

    public void Fallo1(View view){
        au_incorrecto.start();
    }
    public void textS(View view){
        au_text.start();
    }
}