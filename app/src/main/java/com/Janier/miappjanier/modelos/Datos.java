package com.Janier.miappjanier.modelos;

public class Datos {
    private  String nombre;
    private  String apellido;
    private String colegio;
    private  int edad;
    private String genero;

    public Datos(String nom, String ape, String cole, int edad, String gen) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = edad;
        this.colegio = cole;
        this.genero = gen;

    }


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setColegio(String colegio){
        this.colegio = colegio;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdad(){
        return edad;
    }
    public String getColegio(){
        return colegio;
    }
    public String getGenero(){
        return genero;
    }
    public Datos(){

    }
}
