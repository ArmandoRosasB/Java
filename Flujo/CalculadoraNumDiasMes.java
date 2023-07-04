import java.util.Scanner;

public class CalculadoraNumDiasMes {
    public static void main(String[] args) {
        int mes;
        int anio;
        int numeroDias = 0;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Ingresa el numero de mes: ");
        mes = scanner.nextInt();

        System.out.print("Ingresa en a\u00F1o: ");
        anio = scanner.nextInt();

        if (mes == 1 || mes == 3 || mes == 3 || mes == 5 || mes == 7 || mes ==8 || mes == 10 || mes == 12){
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            numeroDias = 30;
        } else {
            // REGLAS PARA SABER SI UN ANIO ES BISIESTO
            /*
             * DEBE SER DIVISIBLE POR 4
             * SI ES DIVISIBLE POR 100, ENTONCES TAMBIEN DEBE SER DIVISIBLE POR 400
             */
            if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }

        System.out.println("Numero de dias = " + numeroDias);
        scanner.close();
    }
}
