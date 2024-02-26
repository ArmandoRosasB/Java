package Introduccion;

public class PrimitivoBooleano {
    public static void main(String[] args) {
        boolean dato_logico = true;
        System.out.println("dato_logico = " + dato_logico);

        double d = 12d;
        float f = 10f;

        dato_logico = d < f;

        System.out.println(d + " < " + f + "= " + dato_logico);
    }
}
