package com.arosas.paquetes.jardin;

import com.arosas.paquetes.hogar.Persona;

public class Perro { // Puede existir tanto en hogar como en jardin
    private String nombre;
    private String raza;

    public Perro (String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getRaza(){
        return this.raza;
    }

    protected String jugar(Persona persona){ // Solo puede jugar en el 'jardin'
        return persona.lanzarPelota();
    }
}
