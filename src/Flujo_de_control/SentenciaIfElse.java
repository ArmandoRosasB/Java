package Flujo_de_control;

import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu promedio: ");

        float promedio = scanner.nextFloat();

        if (promedio >= 9f){
            System.out.println("Excelente promedio");
        } else if (promedio >= 8){
            System.out.println("Buen promedio");
        } else if (promedio >= 7){
            System.out.println("Promedio aprobatorio");
        } else {
            System.out.println("Reprobaste");
        }

    }
}
