public class StringArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;

        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);

        }

        // split(regex) -> Crea un arreglo de string separados pro la expresion regular dada
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String [] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for(int i = 0; i < l; i++){
            System.out.println(arreglo2[i]);
        }


        String archivo = "alguna.imagen.jpg";
        String [] archivoArr = archivo.split("\\.");

        l = archivoArr.length;
        
        for(int i = 0; i < l; i++){
            System.out.println(archivoArr[i]);
        }


        System.out.println("Extension = " + archivoArr[l -1]);
   }
}
