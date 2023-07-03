public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double promedio =  (i + j + k) / (double) 3;
        System.out.println("Promedio = " + promedio);

        promedio =  i + j + k / (double) 3 * 10;
        System.out.println("Promedio = " + promedio);

        promedio =  (i + j + k) / (double) 3 * 10;
        System.out.println("Promedio = " + promedio);

        promedio =  ++i + j-- + k / (double) 3 * 10; // (15 + 8) + 66.6
        System.out.println("Promedio = " + promedio);
    }
}
