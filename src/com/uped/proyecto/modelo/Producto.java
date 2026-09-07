package com.uped.proyecto.modelo;

public class Producto {
    private final String codigo;
    private final String nombre;
    private final double precio;
    private int stock;

    public Producto(String codigo, String nombre, double precio, int stock) {
        validar(codigo, nombre, precio, stock);
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    private void validar(String codigo, String nombre, double precio, int stock) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El codigo no puede estar vacio.");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio.");
        }
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Stock de " + nombre + ": " + stock);
        }
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= 0 || cantidad > stock) {
            return false;
        }
        stock -= cantidad;
        return true;
    }

    public static Producto nuevo(String codigo, String nombre, double precio, int stock) {
        return new Producto(codigo, nombre, precio, stock);
    }

    @Override
    public String toString() {
        return "Producto{codigo='" + codigo + "', nombre='" + nombre
                + "', precio=" + precio + ", stock=" + stock + "}";
    }
}
