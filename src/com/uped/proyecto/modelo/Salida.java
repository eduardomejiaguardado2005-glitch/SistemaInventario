package com.uped.proyecto.modelo;

public class Salida extends MovimientoInventario {

    public Salida(String id, String fecha, int cantidad) {
        super(id, fecha, cantidad);
    }

    public boolean aplicarSalida(Producto producto) {
        boolean realizada = producto.reducirStock(cantidad);
        if (realizada) {
            System.out.println("Salida " + id + " aplicada correctamente.");
        } else {
            System.out.println("No hay suficiente stock para la salida " + id + ".");
        }
        return realizada;
    }
}
