/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_3;

/**
 *
 * @author jpb
 */
public class Prisma extends FiguraGeométrica {
    private double base;
    private double altura;
    private double largo;
    
    public Prisma(double base, double altura, double largo) {
        this.base = base;
        this.altura = altura;
        this.largo = largo;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie()); 
    }
    
    public double calcularVolumen() {
        double volumen = base * altura * largo / 2;
        return volumen;
    }
    
    public double calcularSuperficie() {
        return (2*(base*altura/2)) + (3*(base*largo));
    }
}
