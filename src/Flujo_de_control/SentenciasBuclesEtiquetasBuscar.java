package Flujo_de_control;

public class SentenciasBuclesEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tristes tigres tragaban trigo en un trigal";
        int count = frase.length();

        int cantidad = 0;
        char letra = 'g';

        for(int i = 0; i < count; i++){
            if (frase.charAt(i) != letra) continue;
            cantidad++;
        }
        System.out.println("El caracter " + letra + " fue encontrado " + cantidad +  " veces");

        String palabra = "trigo";
        int cantidad_palabra = 0;

        buscar:
        for(int i = 0; i < count; i++){
            int k = i;
            for(int j= 0; j < palabra.length(); j++){
                if (frase.charAt(k++) != palabra.charAt(j)){
                    continue buscar;
                }
            }
            cantidad_palabra++;
        }

        System.out.println("La palabra " + palabra + " fue encontrada " + cantidad_palabra +  " veces");

    }
}
