import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        String factura, resultado;
        double precioUno, precioDos, impuesto, bruto, neto;
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Recibimos el nombre de la factura
        System.out.println("Ingresa el nombre de la facutra");
        factura = scanner.nextLine();

        // Recibimos los precios de los productos
        System.out.println("Ingrese el precio del primer producto");
        precioUno = scanner.nextDouble();

        System.out.println("Ingrese el precio del segundo producto");
        precioDos = scanner.nextDouble();

        bruto = precioUno + precioDos;
        impuesto = bruto * .19;
        neto = bruto * 1.19;

        resultado = "La factura " + factura + " tiene un total bruto de " + Double.toString(bruto) + ", con un impuesto de " + Double.toString(impuesto) + " y el monto después de impuesto es de " + Double.toString(neto);
        System.out.println(resultado);
        scanner.close();
    }
}