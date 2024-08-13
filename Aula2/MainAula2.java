package com.aula2;

public class MainAula2 {
    public static void main(String[] args) {
//        Revolver r = new Revolver(6, 2);
//        r.recarregar();
//        r.atirar();
//        r.mostrar();
//
//        Revolver r2 = new Revolver(6, 6);
//        r2.recarregar();
//        r2.atirar();
//        r2.mostrar();

        Quadrado q = new Quadrado(-10);
        q.calculos();
        q.setLado(5);
        q.calculos();
        double x = q.getLado();
        System.out.println(x);
    }
}
