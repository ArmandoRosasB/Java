package Linea_de_comandos;

public class ArgumentosLineaDeComandos {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes ingresar al menos un argumento o parámetro");
            System.exit(-1);
        }
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumento " + i + ": " + args[i]);
        }


    }
}
