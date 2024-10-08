// Compra.java
package com.aluracursos.aplicacioncompras.modelo;

public class Compra {
    private String description;
    private double value;

    public Compra(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }
}