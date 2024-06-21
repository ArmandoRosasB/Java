package com.arosas.paquetes;

import com.arosas.paquetes.hogar.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Jose Armando Rosas Balderas");

        System.out.println("Nombre: " + persona.getNombre());
    }
}
