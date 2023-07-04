public class SentenciaWhile {
    public static void main(String[] args) {
        
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;

        System.out.println();

        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println();
        prueba = false;
        
        while (prueba) {
            System.out.println("Nunca se ejecuta");
        }

        do {
            System.out.println("Esto si se ejecuta");
        } while (prueba);
    }
}
