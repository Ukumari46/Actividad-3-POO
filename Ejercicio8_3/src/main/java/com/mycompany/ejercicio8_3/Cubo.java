/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_3;

/**
 *
 * @author jpb
 */
public class Cubo extends FiguraGeométrica {
    private double lado;
    
    public Cubo(double lado) {
        this.lado = lado;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie()); 
    }
    
    public double calcularVolumen() {
        double volumen = (Math.pow(lado,3));
        return volumen;
    }
    
    public double calcularSuperficie() {
        double áreaLado = (Math.pow(lado, 2));
        return áreaLado * 6; 
    }
}
