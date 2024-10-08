// TarjetaDeCredito.java
package com.aluracursos.aplicacioncompras.modelo;

import java.util.ArrayList;
import java.util.List;

public class TarjetaDeCredito {
    private double limit;
    private List<Compra> compras;

    public TarjetaDeCredito(double limit) {
        this.limit = limit;
        this.compras = new ArrayList<>();
    }

    public boolean makePurchase(String description, double value) {
        if (value <= getBalance()) {
            compras.add(new Compra(description, value));
            return true;
        }
        return false;
    }

    public void displayPurchases() {
        System.out.println("*********************");
        System.out.println("COMPRAS REALIZADAS:");
        for (Compra compra : compras) {
            System.out.printf("%s - %.1f%n", compra.getDescription(), compra.getValue()); // Corregido: compra en lugar de compras
        }
        System.out.println("*********************");
    }

    public double getBalance() {
        double totalCompras = compras.stream().mapToDouble(Compra::getValue).sum();
        return limit - totalCompras;
    }
}