package org.arosas.appfacturas.modelos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems = 0;

    private static int ultimoFolio = 0;
    public static final int MAX_ITEMS = 12;

    public Factura(String descripcion, Cliente cliente){
        this.folio = ++ultimoFolio;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.fecha = new Date();
    }

    public Factura(String descripcion, Cliente cliente, Date fecha){
        this.folio = ++ultimoFolio;
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.fecha = fecha;
    }

    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if (indiceItems < MAX_ITEMS){
            items[indiceItems++] = item;
        }
    }

    public double calcularTotal() {
        double total = 0;
        for(ItemFactura item : items){
            if (item == null) continue;
            total += item.calcularImporte();
        }
        return total;
    }

    public String verDetalle(){
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM 'del' yyyy");
        StringBuilder sb = new StringBuilder("Factura Numero ").append(folio)
                .append("\nFecha de emision: ").append(df.format(this.fecha))
                .append("\nCliente: ").append(this.cliente.getNombre())
                .append("\t NIF: ").append(this.cliente.getNif())
                .append("\n\nDescripcion: ").append(this.descripcion)
                .append('\n')
                .append("\n#\tNombre\t$\tCantidad\tTotal");

        for(ItemFactura item: items){
            if (item == null) continue;
            sb.append("\n").append(item.getProducto().getCodigo())
                    .append('\t').append(item.getProducto().getNombre())
                    .append('\t').append(item.getProducto().getPrecio())
                    .append('\t').append(item.getCantidad())
                    .append('\t').append(item.calcularImporte());
        }

        sb.append("\nTotal: ").append(this.calcularTotal());

        return sb.toString();
    }
}
