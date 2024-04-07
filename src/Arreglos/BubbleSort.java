package Arreglos;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random ran = new Random();
        int [] arr = new int [10];

        for(int i = 0; i < 10; i++){
            arr[i] = 1 + (ran.nextInt()) % (20);
        }

        System.out.print("Arreglo sin ordenar = { ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");

        for(int i = arr.length - 1; i > 0; i--){
            for(int j = 1; j <= i; j++){
                if (arr[j] < arr[j - 1]) swap(arr, j, j-1);
            }
        }

        System.out.print("Arreglo ordenado = {");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");

    }

    public static void swap (int [] arr, int i, int j){
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }
}
