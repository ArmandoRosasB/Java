import java.util.Scanner;

public class EjemplosSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes;
        String nombreMes = null;
        System.out.print("Ingresa un numero de mes: ");
        mes = scanner.nextInt();

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
                break;
        }

        System.out.println("Nombre del mes: " + nombreMes);
        int dias = 0;
        int anio;
        System.out.print("Ingresa el a\u00F1o: ");
        anio = scanner.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;

            case 2:
                if (anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;

            default:
                System.out.println("Indefinido");

        }

        System.out.println("Numero de dias de ese mes: " + dias);
        scanner.close();
    }
}
