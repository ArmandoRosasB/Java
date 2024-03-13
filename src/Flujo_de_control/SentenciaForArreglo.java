package Flujo_de_control;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String [] nombres = {"Ramona", "Armando", "Ian", "Ramona", "Uri", "Mafer"};
        int count = nombres.length;

        for(int i = 0; i < count; i++){
            System.out.println(i + ".- " + nombres[i]);
        }

        System.out.println();

        String objetivo = "Armando";

        for(int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(objetivo)){
                System.out.println("Objetivo encontrado en la posicion " + i);
                break;
            }
        }

    }
}
