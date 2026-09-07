package com.uped.proyecto.modelo;

public class Salida {
    private final String idSalida;
    private final String fecha;
    private final int cantidad;

    public Salida(String idSalida, String fecha, int cantidad) {
        if (idSalida == null || idSalida.isBlank()) {
            throw new IllegalArgumentException("El ID de salida no puede estar vacio.");
        }
        if (fecha == null || fecha.isBlank()) {
            throw new IllegalArgumentException("La fecha no puede estar vacia.");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }
        this.idSalida = idSalida;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public boolean aplicarSalida(Producto producto) {
        boolean realizada = producto.reducirStock(cantidad);
        if (realizada) {
            System.out.println("Salida " + idSalida + " aplicada correctamente.");
        } else {
            System.out.println("No hay suficiente stock para la salida " + idSalida + ".");
        }
        return realizada;
    }
}
