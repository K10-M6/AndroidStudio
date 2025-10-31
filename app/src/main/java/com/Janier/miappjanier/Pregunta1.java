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

public class Pregunta1 extends AppCompatActivity {
    private MediaPlayer au_correcto, au_incorrecto, au_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu_app);
        au_correcto = MediaPlayer.create(Pregunta1.this,R.raw.a_sound);
        au_incorrecto = MediaPlayer.create(Pregunta1.this,R.raw.a_incorrect);
        au_text = MediaPlayer.create(Pregunta1.this,R.raw.buttonsounds);
    }

    public void Apple(View view){
        au_correcto.start();
        Intent Pregunta2 = new Intent( Pregunta1.this, Pregunta2.class);
        startActivity(Pregunta2);
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