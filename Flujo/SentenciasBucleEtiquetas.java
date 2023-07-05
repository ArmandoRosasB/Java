public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {
        
        // IDENTIFICADOR DE UN BUCLE
        // etiqueta: ciclo
        bucle1: 
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if (i ==2){
                    continue bucle1;
                }

                System.out.println("i = " + i + ", " + j);
            }
        }

        System.out.println();

        bucle2: 
        for(int i = 0; i < 5; i++){
            System.out.println();
            for(int j = 0; j < 5; j++){
                if (i ==2){
                    break bucle2;
                }

                System.out.println("i = " + i + ", " + j);
            }
        }

        semana:
        for(int i = 1; i <= 7; i++){
            int j = 1;
            horas:
            while (j <= 8){
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + ": Descansamos el fin de semana");
                    continue semana;
                }
                System.out.println("Dia " + i + ", trabajando a las " + j + "hrs. ");
                j++;
            }
        }
    }
}
