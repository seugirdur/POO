package org.example;

public class Calculadora {


    private double n1, n2;



    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double somar() {
        return n1 + n2;
    }

    public double subtrair() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double dividir() throws Exception{
        if (n2 == 0) {
            throw new ArithmeticException("Não pode dividir por zero");
        }
        return n1/n2;
    }


}
