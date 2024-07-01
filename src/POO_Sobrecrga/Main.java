package POO_Sobrecrga;

import static POO_Sobrecrga.Calculadora.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Sumar int: " + sumar(1, 2));
        System.out.println("Sumar float: " + sumar(10.6f, 10.0f));
        System.out.println("Sumar float-int: " + sumar(1.5f, 3));
        System.out.println("Sumar int-float: " + sumar(2, 2.5f));
        System.out.println("Sumar double: " + sumar(5d, 5d));
        System.out.println("Sumar string: " + sumar("10", "5"));
        System.out.println("Sumar 3 int: " + sumar(1, 2, 3));
        System.out.println("Sumar long: " + sumar(1L, 2L));

        System.out.println("Sumar int-char: " + sumar(10, '@'));
        System.out.println("Sumar float-int: " + sumar(10f, '@'));


        System.out.println("Sumar n int: " + sumar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Sumar un float y n int: " + sumar(10.5f, 5, 6, 7, 8, 9, 10));
        System.out.println("Sumar n double: " + sumar(10.0, 3.0, 5.5, 3.4, 5.0));
    }
}
