package Operadores;

public class InstanceOf {
    public static void main(String[] args) {
        String texto = "Este es un texto";
        Integer numero = 8;
        Double decimal = 12.47;

        boolean b1 = texto instanceof String;
        System.out.println("La variable texto es un String: " + b1);

        b1 = texto instanceof Object;
        System.out.println("La variable texto es un Object: " + b1);

        System.out.println();

        b1 = numero instanceof Integer;
        System.out.println("La variable numero es un Integer: " + b1);

        b1 = numero instanceof Number;
        System.out.println("La variable numero es un Number: " + b1);

        b1 = numero instanceof Object;
        System.out.println("La variable numero es un Object: " + b1);

        System.out.println();

        b1 = decimal instanceof Number;
        System.out.println("La variable decimal es un Double: " + b1);

    }
}
