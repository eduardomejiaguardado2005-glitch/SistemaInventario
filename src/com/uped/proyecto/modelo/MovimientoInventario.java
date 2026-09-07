package com.uped.proyecto.modelo;

public abstract class MovimientoInventario {
    protected String id;
    protected String fecha;
    protected int cantidad;

    public MovimientoInventario(String id, String fecha, int cantidad) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("El ID no puede estar vacio.");
        }
        if (fecha == null || fecha.isBlank()) {
            throw new IllegalArgumentException("La fecha no puede estar vacia.");
        }
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero.");
        }
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }
}
