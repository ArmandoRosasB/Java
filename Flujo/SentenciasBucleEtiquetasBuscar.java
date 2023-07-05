public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        // Cuantas veces se encuentra un caracter en un string
        String frase = "Tres tristes tigres tragan trigo en un trigal trigo";
        /*
        char target = 'g';
        int count = frase.length();

        int cantidad = 0;

        for(int i = 0; i < count; i++){
            if (frase.charAt(i) != target) continue;
            
            cantidad++;
        }

        System.out.println("Encontrado = " + cantidad + " veces el caracter '" + target + "' en la frase");
        */


        // Cuantas veces se encuentra una palabra en una frase

        String target = "trigo";

        int lenPalabra = target.length();
        int lenFrase = frase.length() - lenPalabra + 1;

        int cantidad = 0;

        buscar:
        for (int i = 0; i < lenFrase; ){
            int aux = i;
            for(int j = 0; j < lenPalabra; j++){
                if (target.charAt(j) != frase.charAt(aux++)) {
                    i++;
                    continue buscar;
                }
                
            }
            cantidad++;  
            i += lenPalabra; 
        }

        System.out.println("Encontrado = " + cantidad + " veces la subfrase '" + target + "' en la frase");
        
    }
}
