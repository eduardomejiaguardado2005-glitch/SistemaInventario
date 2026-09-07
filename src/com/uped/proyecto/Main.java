package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SEMANA 5: HERENCIA ===");

        Cliente cliente = new Cliente("Ana López", "04512378-9", "7777-1234");
        System.out.println(cliente.presentarse());

        Empleado empleado = new Empleado("Luis Pérez", "06223456-1", 850.0);
        System.out.println(empleado.presentarse());
        empleado.actualizarNombre("Luis Pérez Martínez");
        System.out.println(empleado.presentarse());

        Visitante visitante = new Visitante("Kevin");
        System.out.println(visitante);

        Estudiante estudiante = new Estudiante(
                "Carlos Gómez", "05123456-7", "MG-12345-25", "Sistemas");
        System.out.println(estudiante);
        estudiante.matricular("Programación III");

        Docente docente = new Docente(
                "María Hernández", "05987654-3",
                "Ingeniería de Software", 8);
        System.out.println(docente);
        docente.impartirClase("Programación III");

        Persona[] personas = {
            new Cliente("Ana", "0451...", "7777-1"),
            new Empleado("Luis", "0622...", 850.0)
        };

        System.out.println("\n=== UPCASTING ===");
        for (Persona p : personas) {
            System.out.println(p.presentarse());
        }

        System.out.println("\n=== SISTEMA DE INVENTARIO ===");
        Producto producto = new Producto("P001", "Teclado", 25.50, 10);
        Entrada entrada = new Entrada("E001", "01/09/2026", 5);
        Salida salida = new Salida("S001", "01/09/2026", 3);

        entrada.aplicarEntrada(producto);
        salida.aplicarSalida(producto);
        System.out.println(producto);
    }
}
