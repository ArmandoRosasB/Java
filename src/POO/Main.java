package POO;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Automovil auto_uno = new Automovil("Ford", "Mustang", Color.ROJO, TipoAutomovil.DEPORTIVO);
        Automovil auto_dos = new Automovil("Chevrolet", "Camaro", Color.NEGRO, TipoAutomovil.DEPORTIVO);
        Automovil auto_tres = new Automovil("Ford", "Mustang Shelby GT500", Color.BLANCO, TipoAutomovil.DEPORTIVO, new Motor(5.0, TipoMotor.BENCINA), new Tanque(50), new Persona("Armando", "Rosas"), null);

        Persona conductor_uno = new Persona("Ivan", "Rosas");
        Persona conductor_dos = new Persona("Laura", "Rosas");

        Rueda [] ruedas = new Rueda[4];
        for(int i = 0; i < ruedas.length; i++){
            ruedas[i] = new Rueda("Michelin", 18, 10.5);
        }

        auto_uno.setConductor(conductor_uno);
        auto_dos.setConductor(conductor_dos);

        auto_uno.setRuedas(ruedas);
        auto_dos.addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5));

        for(int i = 0; i < 5; i++){
            auto_tres.addRueda(new Rueda("Good year", 19, 11));
        }


        auto_uno.setFabricante("Ford");
        auto_uno.setModelo("Mustang");
        auto_uno.setColor(Color.BLANCO);

        System.out.println(auto_uno);
        System.out.println(auto_dos);
        System.out.println(auto_tres);

        System.out.println(auto_uno.acelerar(2000));
        System.out.println(auto_dos.acelerar(1900));
        System.out.println(auto_tres.acelerar(3000));

        System.out.println();

        System.out.println(auto_uno.frenar());
        System.out.println(auto_dos.frenar());
        System.out.println(auto_tres.frenar());
        System.out.println();

        System.out.println("Son el mismo auto: " + (auto_uno.equals(auto_dos)));
        System.out.println();
        System.out.println("Total autos: " + Automovil.total_autos);
        System.out.println("Velocidad maxima en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima en ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);


        Automovil [] automoviles = {
                auto_uno,
                auto_dos,
                auto_tres
        };

        Arrays.sort(automoviles);
        for(int i = 0; i < automoviles.length; i++){
            System.out.println(i + "- " + automoviles[i].getFabricante() + " " + automoviles[i].getModelo());
        }

    }
}
