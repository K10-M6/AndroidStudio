package com.Janier.miappjanier.modelos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class Manager {

    //declaramos variables para llamar la conexion

    private ConexionBD conexionBD;
    private SQLiteDatabase db;

    public Manager(Context context){
        //llamo la conexión
        conexionBD = new ConexionBD(context);
    }

    public void openBD(){
        db = conexionBD.getWritableDatabase();
    }

    public void openBdRd(){
        db = conexionBD.getReadableDatabase();
    }

    public void closeBd(){
        db.close();
    }

    public long insertData(Datos datos){
        openBD();
        ContentValues values = new ContentValues();
        values.put("nombre", datos.getNombre());
        values.put("apellido", datos.getApellido());
        values.put("colegio", datos.getColegio());
        values.put("edad", datos.getEdad());
        values.put("genero", datos.getGenero());
        long id = db.insert("tablaIngles", null, values);
        return id;
    }

    public ArrayList<Datos> listarData(){
        openBdRd();
        ArrayList<Datos> lista = new ArrayList<>();

        String sql = "SELECT * FROM tablaIngles";
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()){
            do {
                Datos datos = new Datos();
                datos.setNombre(cursor.getString(0));
                datos.setApellido(cursor.getString(1));
                datos.setColegio(cursor.getString(2));
                datos.setEdad(cursor.getInt(3));
                datos.setGenero(cursor.getString(4));
                lista.add(datos);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return lista;
    }
}