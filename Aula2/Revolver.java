package com.aula2;

public class Revolver {

    int qtAtualMuni;
    int qtMaxMuni;

    public Revolver(int qtMaxMuni, int qtAtualMuni) {
        this.qtMaxMuni = qtMaxMuni;
        this.qtAtualMuni = qtAtualMuni;
    }

    void atirar() {
        if (qtAtualMuni > 0) {
            System.out.println("PA!");
            qtAtualMuni--;
        }
    }

    void recarregar() {
        if (qtAtualMuni == qtMaxMuni) {
           System.out.println("Munição cheia!");
           return;
        }
        for (int i = qtAtualMuni; i < qtMaxMuni; i++) {
            System.out.print("tic.. ");
        }
        qtAtualMuni = qtMaxMuni;
    }

    void mostrar() {
        System.out.println("Munições: " + qtAtualMuni);
    }

}
