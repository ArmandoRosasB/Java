package POO;

public class Main {
    public static void main(String[] args) {
        Automovil auto_uno = new Automovil("Ford", "Mustang", Color.ROJO, TipoAutomovil.DEPORTIVO);
        Automovil auto_dos = new Automovil("Chevrolet", "Camaro", Color.NEGRO, TipoAutomovil.DEPORTIVO);

        auto_uno.setFabricante("Ford");
        auto_uno.setModelo("Mustang");
        auto_uno.setColor(Color.BLANCO);

        System.out.println(auto_uno);
        System.out.println(auto_dos);

        System.out.println(auto_uno.acelerar(2000));
        System.out.println(auto_dos.acelerar(1900));

        System.out.println();

        System.out.println(auto_uno.frenar());
        System.out.println(auto_dos.frenar());
        System.out.println();

        System.out.println("Son el mismo auto: " + (auto_uno.equals(auto_dos)));
        System.out.println();
        System.out.println("Total autos: " + Automovil.total_autos);
        System.out.println("Velocidad maxima en carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima en ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);
    }
}
