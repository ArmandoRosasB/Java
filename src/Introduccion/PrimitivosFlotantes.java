package Introduccion;

public class PrimitivosFlotantes {
    public static void main(String[] args) {
        float _float = 12345432.123432e5f;
        System.out.println("_float = " + _float);
        System.out.println("Un flotante corresponde a " + Float.SIZE);
        System.out.println("Valor maximo de un flotante: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un flotante: " + Float.MIN_VALUE);
        System.out.println();

        double _double = 2147483648.23456765d;
        System.out.println("_double = " + _double);
        System.out.println("Un flotante corresponde a " + Double.SIZE);
        System.out.println("Valor maximo de un flotante: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un flotante: " + Double.MIN_VALUE);
        System.out.println();

    }
    
}
