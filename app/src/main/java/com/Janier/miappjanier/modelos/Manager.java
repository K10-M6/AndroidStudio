package com.Janier.miappjanier.modelos;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Manager {

    //declaramos variables para llamar la conexion

    private ConexionBD conexionBD;
    private SQLiteDatabase db;
    public Manager(Context context){
        //llamo la conexión
        conexionBD = new ConexionBD(context);
    }
    public void openBD(){
        //abre la base de datos modo escritura
        db= conexionBD.getWritableDatabase();

    }
    public void openBdRd(){
        //abre la base de datos modo lectura
        db= conexionBD.getReadableDatabase();
    }
    public void closeBd(){
        //cierra la base de datos
        db.close();
    }
    public long insertData(Datos datos){
        try {
            openBD();

            ContentValues values = new ContentValues();
            values.put("nombre", datos.getNombre());
            values.put("apellido", datos.getApellido());
            values.put("colegio", datos.getColegio());
            values.put("edad", datos.getEdad());
            values.put("genero", datos.getGenero());
            long id = db.insert("tablaIngles", null, values);


            System.out.println("DEBUG INSERT: id=" + id);
            closeBd();
            return id;


        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }
}
