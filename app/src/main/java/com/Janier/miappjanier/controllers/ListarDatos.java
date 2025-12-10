package com.Janier.miappjanier.controllers;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.Janier.miappjanier.R;
import com.Janier.miappjanier.modelos.Datos;
import com.Janier.miappjanier.modelos.Manager;

public class ListarDatos extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<Datos> adapter;
    Manager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_datos);

        listView = findViewById(R.id.ListDate);
        manager = new Manager(ListarDatos.this);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, manager.listarData());
        listView.setAdapter(adapter);
    }
}