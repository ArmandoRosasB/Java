package Valor_Referencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        
        int [] edades = {10, 11, 12}; 

        System.out.println("iniciamos el main");
        for(int edad: edades){
            System.out.println("edad[i] = " + edad);
        }
        System.out.println("Antes de llamar al metodo test");
        test(edades);

        System.out.println("Despues de llamar al metodo test");
        for(int edad: edades){
            System.out.println("edad[i] = " + edad);
        }

        System.out.println("Finaliza el metodo main con los datos del arreglo modificados");
    }

    public static void test(int [] edadArr) {
        System.out.println("Iniciamos el metodo test");
        
        for(int i = 0; i < edadArr.length; i++){
            edadArr[i] += 20;
        }

        System.out.println("Finaliza el metodo test");
    }
}
