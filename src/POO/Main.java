package POO;

public class Main {
    public static void main(String[] args) {
        Automovil auto_uno = new Automovil();
        Automovil auto_dos = new Automovil("Chevrolet", "Camaro", "Negro");

        System.out.println(auto_uno);
        System.out.println(auto_dos);

        System.out.println(auto_uno.acelerar(2000));
        System.out.println(auto_dos.acelerar(1900));

        System.out.println();

        System.out.println(auto_uno.frenar());
        System.out.println(auto_dos.frenar());
        System.out.println();

    }
}
