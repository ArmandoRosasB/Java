
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        String nombre = "", respuesta = "";
        double precio1, precio2, totalBruto, impuesto, totalNeto;
        Scanner scanner = new Scanner(System.in);
        
        //System.out.print("Nombre/Descripción de la factura: ");
        nombre = scanner.nextLine();

        //System.out.print("Precio 1er producto: $");
        precio1 = scanner.nextDouble();

        //System.out.print("Precio 2do producto: $");
        precio2 = scanner.nextDouble();

        // Total (19% IVA)
        totalBruto = precio1 + precio2;
        impuesto = 0.19*totalBruto;
        totalNeto = totalBruto+impuesto;

        scanner.close();

        // Información
        respuesta += "La factura " + nombre + 
                     " tiene un total bruto de " + Double.toString(totalBruto) + 
                     ", con un impuesto de " + String.valueOf(impuesto) + 
                     " y el monto después de impuesto es de " + Double.toString(totalNeto);
        
        System.out.println(respuesta);
    }
}
