package com.Janier.miappjanier;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer au_buttonsounds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(this, "", Toast.LENGTH_LONG).show();
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
    public void IrRegister(View view){
        au_buttonsounds.start();
        Intent Registrar = new Intent(MainActivity.this, Register.class);
        startActivity(Registrar);
    }
}