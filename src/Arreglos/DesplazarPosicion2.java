package Arreglos;

import java.util.Scanner;

public class DesplazarPosicion2 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);


        System.out.print("Arreglo = { ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");

        int pos = -1, val = -1;
        System.out.print("\nIngresa el nuevo valor: " );
        val = scanner.nextInt();

        do {
            System.out.print("\nIngresa la posicion (0 - 9): ");
            pos = scanner.nextInt();
        } while (pos < 0 || pos > arr.length - 1);


        for(int i = arr.length - 1; i > pos; i--){
            arr[i] = arr[i - 1];
        }
        arr[pos] = val;


        System.out.print("Arreglo desplazado = { ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("}");
    }
}
