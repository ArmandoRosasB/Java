package Math;

import java.util.Random;

public class MathRandom {
    /*
    Formula especial con random enteros
    numero = limite_inferior + rand() % (limite_superior + 1 - limite_inferior)

    */
    public static void main(String[] args) {
        String [] colores = {"azul", "amarillo", "verde", "rojo", "blanco", "negro"};
        
        double random = Math.random(); // [0, 1)
        int color_aleatorio = (int) Math.floor((random * colores.length));

        System.out.println("Usando random de Math");
        System.out.println("random = " + random);
        System.out.println("color_aleatorio = " + color_aleatorio);
        System.out.println("Tu color aleatorio es " + colores[color_aleatorio]);

        Random ran = new Random();

        System.out.println("Usando random de java util");

        int randomInt = ran.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = ran.nextDouble();
        System.out.println("randomDouble = " + randomDouble);



    }
}
