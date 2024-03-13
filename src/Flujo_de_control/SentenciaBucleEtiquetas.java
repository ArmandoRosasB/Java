package Flujo_de_control;

public class SentenciaBucleEtiquetas {
    public static void main(String[] args) {

        bucle:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (i == 2) {
                    continue bucle;
                }
                System.out.println("[i = " + i + ", j = " + j + "]");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");

        etiqueta:
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if (i == 2){
                    break etiqueta;
                }
                System.out.println("[i = " + i + ", j = " + j + "]");
            }
        }
    }
}
