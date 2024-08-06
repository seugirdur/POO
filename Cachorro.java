package com.aula;

public class Cachorro {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome, raca;

    public void latir() {
        System.out.println(nome + ": AU AU");
    }

    void mostrarRaca() {
        System.out.println("teste");
    }
}
