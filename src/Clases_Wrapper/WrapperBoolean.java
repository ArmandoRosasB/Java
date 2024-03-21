package Clases_Wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;

        num1 = Integer.valueOf(5);
        num2 = Integer.valueOf(10);

        boolean primitivo = num1 > num2;
        Boolean objeto = Boolean.valueOf(primitivo);
        Boolean objeto2 = Boolean.valueOf("false");

        System.out.println("primitivo = " + primitivo);
        System.out.println("objeto = " + objeto);
        System.out.println("objeto2 = " + objeto2);

        System.out.println("Comparando dos objetos boolean: " + (objeto == objeto2)); // Compara valores
        System.out.println("Comparando dos objetos boolean: " + (objeto.equals(objeto2)));


        boolean primitivo2 = objeto.booleanValue();
        System.out.println("primitivo2 = " + primitivo2);

    }
}
