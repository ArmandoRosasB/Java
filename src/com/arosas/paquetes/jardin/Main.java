package com.arosas.paquetes.jardin;

import com.arosas.paquetes.hogar.Persona;
import static com.arosas.paquetes.hogar.Persona.saludar;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Jose Armando Rosas Balderas");
        Perro perro = new Perro("Tobby", "Chihuahua");

        System.out.println("Nombre: " + persona.getNombre());

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo = saludar();
        System.out.println("saludo = " + saludo);

    }
}
