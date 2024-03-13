package Flujo_de_control;

public class SentenciaWhile {
    public static void main(String[] args) {
        int i = 0;

        while (i < 5){
            System.out.println("i= " + i);
            i++;
        }

        i = 0;
        boolean bandera = true;

        do {
            if (i == 1) {
                bandera = false;
            }
            System.out.println("Se ejecuta al menos una vez");
            i++;
        } while(bandera);
    }
}
