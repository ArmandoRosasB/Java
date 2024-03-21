package Clases_Wrapper;

import java.lang.reflect.Method;

public class GetClass {
    public static void main(String[] args) {
        String cadena = "Hola mundo";

        Class claseStr = cadena.getClass();


        System.out.println("claseStr.getName() = " + claseStr.getName());
        System.out.println("claseStr.getSimpleName() = " + claseStr.getSimpleName());
        System.out.println("claseStr.getPackageName() = " + claseStr.getPackageName());

        System.out.println("\nMetodos de la clase string");
        for(Method metodo : claseStr.getMethods()) {
            System.out.println(metodo.getName());
        }


        Integer entero = 5;

        Class claseInt = entero.getClass();

        System.out.println("\nclaseInt.getName() = " + claseInt.getName());
        System.out.println("claseInt.getSuperclass() = " + claseInt.getSuperclass().getName());
        System.out.println("claseInt.getSuperclass().getSuperclass = " + claseInt.getSuperclass().getSuperclass().getName());

    }
}
