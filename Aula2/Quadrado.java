package com.aula2;

public class Quadrado {

    private double lado;

    public Quadrado(double lado) {
//        this.lado = lado < 0 ? lado * -1 : lado;
        this.lado = Math.max(lado, 0);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    private void calcArea() {
        System.out.println("Área: " + Math.pow(lado, 2));
    }

    private void calcPerimetro() {
        System.out.println("Perímetro: " + lado * 4);
    }

    public void calculos() {
        calcArea();
        calcPerimetro();
    }
}
