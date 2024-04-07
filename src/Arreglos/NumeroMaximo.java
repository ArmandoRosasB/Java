package Arreglos;

import java.util.Random;

public class NumeroMaximo {
    public static void main(String[] args) {
        Random ran = new Random();
        int [] arr = new int [10];

        for(int i = 0; i < 10; i++){
            arr[i] = 1 + (ran.nextInt()) % (20);
        }

        int max = Integer.MIN_VALUE;

        for (int n : arr) {
            max = (max > n)? max : n; // Math.max(max, n)
        }

        System.out.print("Arreglo = { ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");

        System.out.println("\nNumero maximo = " + max);
    }
}
