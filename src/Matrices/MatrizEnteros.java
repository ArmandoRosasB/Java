package Matrices;

public class MatrizEnteros {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4];

        System.out.println("Numero de filas: " + matriz.length);
        System.out.println("Numero de columnas: " + matriz[0].length);

        System.out.println("Matriz: ");
        for(int [] fila: matriz){
            for(int columna : fila){
                System.out.print(columna + "  ");
            }
            System.out.println();
        }
    }
}
