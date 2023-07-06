package Valor_Referencia;

public class PasarPorReferencia2 {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.modificarNombre("Armando");

        System.out.println("iniciamos el main");

        System.out.println("persona.getNombre = " + persona.getNombre());
        test(persona);

        System.out.println("Despues de llamar al metodo test");
        System.out.println("persona.getNombre = " + persona.getNombre());
        
        System.out.println("Finaliza el metodo main");
    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test");
    }
}

class Persona {
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}