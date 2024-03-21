package Clases_Wrapper;

public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1234);
        Integer num2 = Integer.valueOf(1234);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        System.out.println("Son el mismo objeto? " + (num1 == num2));
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

    }
}
