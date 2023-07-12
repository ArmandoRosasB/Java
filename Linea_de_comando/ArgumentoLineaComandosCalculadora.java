package Linea_de_comando;

public class ArgumentoLineaComandosCalculadora {
    public static void main(String[] args) {

        if(args.length != 3){
            System.err.println("Porfavor ingresar un signo (+, -, *, /) y dos numeros enteros");
            System.exit(-1);
        }


        char operacion = args[0].toCharArray()[0];
        int a = 0, b = 0;
        double resultado = 0.00;

        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.err.println("Cuidado, a y b deben ser enteros");
            System.exit(1);
            
        }

        
        switch (operacion) {
            case '+':
                resultado = a + b; 
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if(b == 0){
                    System.err.println("No se puede dividir entre 0");
                    System.exit(-1);
                }
                resultado = a / b;
                break;
            default:
                resultado = a + b;
        }

        System.out.println("EL resultado de la operacion '" + operacion + "' es: " + resultado);

    }
}
