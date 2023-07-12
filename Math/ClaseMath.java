package Math;

public class ClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3); // Absoluto de un numero
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);
        
        double max = Math.max(3.5, 2.2);
        System.out.println("Max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("Techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("Piso = " + piso);
        
        long entero = Math.round(3.4f);
        System.out.println("entero = " + entero);

        double exp = Math.exp(1); // e ^ x
        System.out.println("exp = " + exp);

        double log = Math.log(10); // ln (x)
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        System.out.println("Convertir " + 1.57  + " radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir " + 90  + " grados a radianes = " + radianes);
    
        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));

        
    }
}
