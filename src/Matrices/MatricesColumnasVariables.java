package Matrices;

public class MatricesColumnasVariables {
    public static void main(String[] args) {
        int [][] matriz = new int[3][];

        matriz[0] = new int[1];
        matriz[1] = new int[2];
        matriz[2] = new int[3];

        System.out.println("Matriz variable:");
        for(int [] fila: matriz){
            for(int columna : fila){
                System.out.print(columna + "  ");
            }
            System.out.println();
        }
    }
}
