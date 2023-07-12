package Math;

import java.util.Random;

public class ClaseMathRandom {
    public static void main(String[] args) {

        String [] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};

        double random = Math.random(); // "[0, 1)"
        System.out.println("random = " + random);

        random *= 7;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);


        random = Math.random();
        random *= colores.length;
        random = Math.floor(random);

        System.out.println("colores = " + colores[(int) random]);
    
    
    
        Random randomObj = new Random(); // usando java.util.Random
        int randomInt = randomObj.nextInt(); // Devuelve un entero
        System.out.println("randomInt = " + randomInt);


        randomInt = randomObj.nextInt(7); // Devuelve un entero de 0 a 7
        System.out.println("randomInt = " + randomInt);

        randomInt = 15 + randomObj.nextInt(25 - 15); // Devuelve un entero de 15 a 25
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);
        
    }   
}
