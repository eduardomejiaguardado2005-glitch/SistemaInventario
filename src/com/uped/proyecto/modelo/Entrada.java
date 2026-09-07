package com.uped.proyecto.modelo;

public class Entrada {
    private final String idEntrada;
    private final String fecha;
    private final int cantidad;

    public Entrada(String idEntrada, String fecha, int cantidad) {
        if (idEntrada == null || idEntrada.isBlank()) {
            throw new IllegalArgumentException("El ID de entrada no puede estar vacio.");
        }
        if (fecha == null || fecha.isBlank()) {
            throw new IllegalArgumentException("La fecha no puede estar vacia.");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }
        this.idEntrada = idEntrada;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public void aplicarEntrada(Producto producto) {
        producto.aumentarStock(cantidad);
        System.out.println("Entrada " + idEntrada + " aplicada correctamente.");
    }
}
