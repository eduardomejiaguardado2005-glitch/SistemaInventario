package com.uped.proyecto.modelo;

import java.time.LocalDate;

public class Empleado {
    private final String dui;
    private final LocalDate fechaIngreso;
    private String cargo;

    public Empleado(String dui, String cargo) {
        if (dui == null || dui.isBlank()) {
            throw new IllegalArgumentException("El DUI no puede estar vacio.");
        }
        if (cargo == null || cargo.isBlank()) {
            throw new IllegalArgumentException("El cargo no puede estar vacio.");
        }
        this.dui = dui;
        this.fechaIngreso = LocalDate.now();
        this.cargo = cargo;
    }

    public void ascender(String nuevoCargo) {
        this.cargo = nuevoCargo;
    }

    @Override
    public String toString() {
        return "Empleado{dui='" + dui + "', cargo='" + cargo + "'}";
    }
}
