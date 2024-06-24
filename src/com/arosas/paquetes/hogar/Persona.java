package com.arosas.paquetes.hogar;

public class Persona { // Puede existir tanto en 'hogar' como en 'jardin'
    private String nombre;

    public Persona (String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String lanzarPelota(){
        return "Lanzando pelota al perrito!";
    }

    public static String saludar(){
        return "Hola a todos!";
    }
}
