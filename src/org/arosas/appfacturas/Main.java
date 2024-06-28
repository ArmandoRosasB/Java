package org.arosas.appfacturas;

import org.arosas.appfacturas.modelos.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setNombre("Jose Armando Rosas Balderas");
        cliente.setNif("5555-5");

        String descripcion;
        System.out.print("Ingrese la descripcion de la factura: ");
        descripcion = scanner.nextLine();

        Factura factura = new Factura(descripcion, cliente);

        Producto producto;

        System.out.println();

        for(int i = 0; i < Factura.MAX_ITEMS; i++){
            producto = new Producto();
            System.out.print("Ingrese el nombre del producto " + producto.getCodigo() + ": ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingresa el precio: ");
            producto.setPrecio(scanner.nextDouble());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura( new ItemFactura(scanner.nextInt(), producto));

            char res;
            System.out.print("Desea agregar otro item? (S/N): ");
            res = scanner.next().charAt(0);

            if (Character.toUpperCase(res) != 'S') break;
            System.out.println();
            scanner.nextLine();
        }
        System.out.println();
        System.out.println(factura.verDetalle());
    }
}
