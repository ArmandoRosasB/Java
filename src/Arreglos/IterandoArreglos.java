package Arreglos;

public class IterandoArreglos {
    public static void main(String[] args) {
        String [] arr = {"Mexico", "Estados Unidos", "Canada", "Alemania", "Holanda"};

        System.out.println("====== Usando un ciclo for ======");
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("\n====== Usando un ciclo for each ======");
        for(String cadena : arr){
            System.out.println(cadena);
        }

        int j = 0;

        System.out.println("\n====== Usando un ciclo while ======");
        while(j < arr.length){
            System.out.println("arr[" + j + "] = " + arr[j++]);
        }


        System.out.println("\n====== Recorriendo el arreglo de forma inversa ======");
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + (arr.length - 1 - i) + "] = " + arr[arr.length - 1 - i]);
        }
        System.out.println();

        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

    }
}
