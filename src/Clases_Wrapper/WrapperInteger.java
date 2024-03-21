package Clases_Wrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 1234;
        // Boxing
        Integer intObjeto1 = Integer.valueOf(intPrimitivo); // Retorno de un objeto

        // Autoboxing
        Integer intObjeto2 = 1234;

        System.out.println("intObjeto1 = " + intObjeto1);
        System.out.println("intObjeto2 = " + intObjeto2);
        System.out.println();

        // Unboxing
        int num1 = intObjeto1.intValue(); // Retorno de un primitivo

        // Autounboxing
        int num2 = intObjeto2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println();

        String cadenaNumerica = "1234";

        Integer entero = Integer.valueOf(cadenaNumerica);
        Short _short = Short.valueOf(cadenaNumerica);

        System.out.println("entero = " + entero);
        System.out.println("short = " + _short);
        

    }
}
