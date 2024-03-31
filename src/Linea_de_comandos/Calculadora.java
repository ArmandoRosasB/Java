package Linea_de_comandos;

public class Calculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            System.err.println("Debes ingresar un operador(sum, mult, res, div) y dos numeros como argumentos");
            System.out.println("Ejemplo: java app.java sum 5 6");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = 0, b = 0;
        try{
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.err.println("Debes ingresar dos numeros enteros: " + e.getMessage());
            System.exit(1);
        }


        double resultado = 0.0;

        switch (operacion) {
            case "sum" -> {
                resultado = a + b;
            }
            case "res" -> {
                resultado = a - b;
            }
            case "mult" -> {
                resultado = a * b;
            }
            case "div" -> {
                if (b == 0){
                    System.err.println("No es posible dividir entre 0");
                    System.exit(-1);
                }
                resultado = (double) a / (double) b;
            }

            default -> {
                System.err.println("Simbolo '" + operacion + "' no reconoido");
                System.exit(-1);
            }
        }

        System.out.println("El resultado de la operacion es " + resultado);
    }
}
