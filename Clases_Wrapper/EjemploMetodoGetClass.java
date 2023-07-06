package Clases_Wrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal!";

        Class strclass = texto.getClass(); // Regresa una instancia del tipo Class

        System.out.println("strclass.getName() = " + strclass.getName());
        System.out.println("strclass.getSimpleName() = " + strclass.getSimpleName());
        System.out.println("strclass.getPackageName() = " + strclass.getPackageName());
        System.out.println();
        
        for(Method metodo: strclass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }


        Integer num = 34;
        Class intClass = num.getClass();
        

        System.out.println("intClass.getName() = " + intClass.getName());
        System.out.println("intClass.getSuperclass() = " + intClass.getSuperclass());

    }
}
