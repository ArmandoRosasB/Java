public class OperadoresRelacionales {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3d;
        boolean m = false;

        // == => igualdad 
        boolean b1 = (i == j);
        System.out.println("b1 (i == j) = " + b1);

        // ! => Negacion
        boolean b2 = !b1;
        System.out.println("b2 (!b1) = " + b2);

        // != => Distinto a 
        boolean b3 = (i != j);
        System.out.println("b3 (i != j) = " + b3);

        boolean b4 = (m == true);
        System.out.println("b4 (m == true) = " + b4);

        boolean b5 = (m == false);
        System.out.println("b4 (m == true) = " + b5);


        // > => Mayor que
        boolean b6 = (i > j);
        System.out.println("b6 (i > j) = " + b6);

        // < => Menor que
        boolean b7 = (i < j);
        System.out.println("b7 (i < j) = " + b7);

        // > => Mayor igual que
        boolean b8 = (l >= k);
        System.out.println("b8 (i >= j) = " + b8);

        // < => Menor que
        boolean b9 = (l <= k);
        System.out.println("b9 (i <= j) = " + b9);
    }
}
