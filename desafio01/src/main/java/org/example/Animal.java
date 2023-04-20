package org.example;

public class Animal {
    private String alimentacao;
    private String reproducao;
    private String locomocao;
    private double peso;
    private double tamanho;

    public Animal(String alimentacao, String reproducao, String locomocao, double peso, double tamanho) {
        this.alimentacao = alimentacao;
        this.reproducao = reproducao;
        this.locomocao = locomocao;
        this.peso = peso;
        this.tamanho = tamanho;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getReproducao() {
        return reproducao;
    }

    public void setReproducao(String reproducao) {
        this.reproducao = reproducao;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}


