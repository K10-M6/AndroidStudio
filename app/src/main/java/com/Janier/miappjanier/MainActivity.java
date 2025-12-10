package com.Janier.miappjanier;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.Janier.miappjanier.modelos.Datos;
import com.Janier.miappjanier.modelos.Manager;

public class MainActivity extends AppCompatActivity {
    Manager manager;
    EditText Nombre, Apellido, Edad;
    Spinner spinCol;
    RadioGroup RdoGenero;
    RadioButton RdoM, RdoF;
    Button BtnRegistro;
    private MediaPlayer au_buttonsounds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        au_buttonsounds = MediaPlayer.create(MainActivity.this,R.raw.buttonsounds);
        Nombre = findViewById(R.id.nombre);
        Apellido = findViewById(R.id.apellido);
        Edad = findViewById(R.id.edad);
        spinCol = findViewById(R.id.spnColegios);
        RdoGenero = findViewById(R.id.rgGenero);
        RdoM = findViewById(R.id.RdMasculino);
        RdoF = findViewById(R.id.RdFemenino);
        BtnRegistro = findViewById(R.id.BtnRegistro);

        BtnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager = new Manager(MainActivity.this);
                //PASAMOS LOS VALORES AL POJO

                String nombre = Nombre.getText().toString();
                String apellido = Apellido.getText().toString();
                String edadtexto = Edad.getText().toString();
                int edad = edadtexto.isEmpty() ? 0  : Integer.parseInt(edadtexto);
                String colegio = spinCol.getSelectedItem().toString();

                int selectedId = RdoGenero.getCheckedRadioButtonId();
                if(selectedId == -1) return;
                RadioButton selectedRadio = findViewById(selectedId);
                String genero = selectedRadio.getText().toString();

                Datos datos = new Datos(nombre, apellido, colegio, edad, genero);
                //LLAMAMOS AL METODO INSERTAR
                long resul = manager.insertData(datos);
                System.out.println("RESULTADO INSERT: " + resul); // ← Ver el valor exacto
                if(resul > 0) {
                    Toast.makeText(MainActivity.this, "Datos insertados", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Error al insertar datos", Toast.LENGTH_SHORT).show();
                }
                iniciar(view);
            }
        });
    }
    public void iniciar (View view){
        au_buttonsounds.start();
        Intent MoverActivity = new Intent(MainActivity.this, Register.class);
        startActivity(MoverActivity);
    }
}