public class PrimitivosFloat {

    static float def; // Atributo de la clase

    public static void main(String[] args) {
        float realFloat = 1.0f;
        float realFloatDos  = 2.12e3f;
        System.out.println("Numero real flotante: " + realFloat);
        System.out.println("Otro numero real flotante: " + realFloatDos);
        System.out.println("float corresponde en byte a : " + Float.BYTES);
        System.out.println("float corresponde en bites a : " + Float.SIZE);
        System.out.println("Maximo valor para float: " + Float.MAX_VALUE);
        System.out.println("Minimo valor para float: " + Float.MIN_VALUE);


        double realDouble = 3.4028235E38;
        System.out.println("\n\nrealDouble = " + realDouble);
        System.out.println("double corresponde en byte a : " + Double.BYTES);
        System.out.println("double corresponde en bites a : " + Double.SIZE);
        System.out.println("Maximo valor para double: " + Double.MAX_VALUE);
        System.out.println("Minimo valor para double: " + Double.MIN_VALUE);


        var varFlotante = 3.1416f;
        System.out.println("\n\nvarFlotante = " + varFlotante);

        //float def; Variables locales de metodos se tienen que inicializar siempre
        System.out.println("Valor defecto de float = " + def);

    }
}
