package Matrices;

public class BuscarElemento {
    public static void main(String[] args) {
        int [][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 5;

        buscar:
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if (target == matriz[i][j]) {
                    System.out.println("Elemento encontrado en la posicion (" + i + ", " + j + ")");
                    break buscar;
                }
            }
        }
    }
}