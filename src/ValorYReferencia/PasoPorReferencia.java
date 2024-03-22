package ValorYReferencia;

public class PasoPorReferencia {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3};

        System.out.println("Iniciamos el metodo main");
        mostrar_arreglo(numeros);

        System.out.println("Llamando al metodo test");
        test(numeros);
        System.out.println("Despues de llamar al metodo test");
        mostrar_arreglo(numeros);

    }

    public static void mostrar_arreglo(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void test(int [] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = 20 + arr[i];
        }
    }
}
