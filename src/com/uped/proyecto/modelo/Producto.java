package com.uped.proyecto.modelo;

public class Producto {
    private final String codigo;
    private final String nombre;
    private final double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (precio < 0 || stock < 0) {
            throw new IllegalArgumentException("Precio y stock no pueden ser negativos.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad <= 0) {
            return;
        }
        this.stock += cantidad;
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= 0 || cantidad > stock) {
            return false;
        }
        stock -= cantidad;
        return true;
    }

    @Override
    public String toString() {
        return "Producto{codigo='" + codigo + "', nombre='" + nombre
                + "', precio=" + precio + ", stock=" + stock + "}";
    }
}
