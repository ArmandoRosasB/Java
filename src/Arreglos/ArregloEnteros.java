package Arreglos;

import java.util.Arrays;

public class ArregloEnteros {
    public static void main(String[] args) {
        int [] arr = new int [4]; // Todos los valores se inicializan con 0

        int i = arr[0];
        int j = arr[1];
        int k = arr[2];
        int l = arr[arr.length - 1];

        System.out.println("\nImprimiendo datos predeterminados");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 3;
        arr[3] = 4;

        i = arr[0];
        j = arr[1];
        k = arr[2];
        l = arr[arr.length - 1];

        System.out.println("\nImprimiendo datos asignados");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        Arrays.sort(arr);


        i = arr[0];
        j = arr[1];
        k = arr[2];
        l = arr[arr.length - 1];

        System.out.println("\nImprimiendo datos ordenados");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }
}
