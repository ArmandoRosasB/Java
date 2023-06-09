public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String... que tal!";

        Integer num = 7;
        
        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object; // Object: Clase padre de todas las clases en java
        System.out.println("texto es del tipo Object = " + b1); 

        b1 = num instanceof Number; // Number: Clase padre de todos las clases numericas
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo Object = " + b1);

        Double decimal = 45.54d;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1  es del tipo Boolean = " + b1);
    }
}
