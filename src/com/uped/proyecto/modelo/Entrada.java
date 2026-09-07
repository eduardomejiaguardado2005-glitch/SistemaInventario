package com.uped.proyecto.modelo;

public class Entrada extends MovimientoInventario {

    public Entrada(String id, String fecha, int cantidad) {
        super(id, fecha, cantidad);
    }

    public void aplicarEntrada(Producto producto) {
        producto.aumentarStock(cantidad);
        System.out.println("Entrada " + id + " aplicada correctamente.");
    }
}
