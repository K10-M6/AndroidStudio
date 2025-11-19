package com.Janier.miappjanier;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.Janier.miappjanier.controllers.ConexionBD;

public class Register extends AppCompatActivity {
    private MediaPlayer au_buttonsounds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        au_buttonsounds = MediaPlayer.create(Register.this,R.raw.buttonsounds);

    }

    public void irMenu(View view){
        au_buttonsounds.start();
    }

    public void IrJugar(View view){
        au_buttonsounds.start();
    }
    public void IrRegister(View view){
        au_buttonsounds.start();
    }
}