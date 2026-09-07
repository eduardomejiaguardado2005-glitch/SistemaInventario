package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJEMPLOS GUIADOS SEMANA 4 ===");

        new Pedido(101);

        Suscripcion s1 = new Suscripcion("ana");
        System.out.println(s1);
        Suscripcion s2 = Suscripcion.premium("carlos");
        System.out.println(s2);

        ConfiguracionReporte config = new ConfiguracionReporte.Builder()
                .titulo("Ventas Q3")
                .conGrafico()
                .build();
        System.out.println(config);

        Carrito carrito = new Carrito();
        carrito.agregar("Café");
        carrito.agregar("Azúcar");
        carrito.getItems().clear();
        System.out.println("Items en el carrito: " + carrito.getItems().size());

        Empleado empleado = new Empleado("04512378-9", "Analista");
        System.out.println(empleado);
        empleado.ascender("Analista Senior");
        System.out.println(empleado);

        Punto original = new Punto(2, 3);
        Punto movido = original.mover(1, 1);
        System.out.println("Original: " + original);
        System.out.println("Movido: " + movido);

        Vehiculo v1 = Vehiculo.nuevo("P123-789", "Kia");
        System.out.println(v1);
        v1.recorrer(150);
        System.out.println(v1);
        v1.recorrer(-20);

        LibroBiblioteca l1 = new LibroBiblioteca("Clean Code", "R. Martin", 3);
        LibroBiblioteca l2 = LibroBiblioteca.unico("Effective Java", "J. Bloch");
        l1.prestar();
        l2.prestar();
        l2.prestar();

        System.out.println("\n=== EJERCICIO 8.1 ===");
        new Registro();

        System.out.println("\n=== EJERCICIO 8.2 ===");
        Vehiculo v2 = Vehiculo.nuevo("P123-789", "Kia");
        System.out.println(v2);
        v2.recorrer(150);
        System.out.println(v2);
        v2.recorrer(-20);

        System.out.println("\n=== EJERCICIO 8.4: BUILDER DE PRODUCTO ===");
        Producto producto1 = Producto.nuevo("P001", "Teclado", 25.50, 10);
        Producto producto2 = new Producto("P002", "Mouse", 15.00, 8);
        System.out.println(producto1);
        System.out.println(producto2);
        producto1.aumentarStock(5);
        System.out.println("Salida permitida: " + producto1.reducirStock(3));
        System.out.println(producto1);
    }
}
