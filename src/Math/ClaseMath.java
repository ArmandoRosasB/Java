package Math;

public class ClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        long round = Math.round(Math.PI);
        System.out.println("round = " + round);

        double exp = Math.exp(1); // e ^ 1
        System.out.println("exp = " + exp);

        double log = Math.log(10); // ln(10)
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3); // 10 ^ 3
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("sin(180) = " + Math.sin(Math.toRadians(180)));
        System.out.println("cos(180) = " + Math.cos(Math.toRadians(180)));
        System.out.println("tan(108) = " + Math.tan(Math.toRadians(180)));
    }

}
