package org.example;

public class Animal {
    private String alimentacao;
    private String reproducao;
    private String locomocao;

    public Animal(String alimentacao, String reproducao, String locomocao) {
        this.alimentacao = alimentacao;
        this.reproducao = reproducao;
        this.locomocao = locomocao;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public String getReproducao() {
        return reproducao;
    }

    public String getLocomocao() {
        return locomocao;
    }
}

