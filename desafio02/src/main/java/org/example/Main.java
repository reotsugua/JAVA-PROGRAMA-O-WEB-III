package org.example;

import org.example.observadores.ObservadorAgua;
import org.example.observadores.ObservadorCeu;
import org.example.observadores.ObservadorTerra;

public class Main {
    public static void main(String[] args) {
        Protocolo olhos = new Protocolo();
        Observador observadorCeu = new ObservadorCeu();
        Observador observadorAgua = new ObservadorAgua();
        Observador observadorTerra = new ObservadorTerra();
        olhos.adicionarObservador(observadorCeu);
        olhos.adicionarObservador(observadorAgua);
        olhos.adicionarObservador(observadorTerra);

        // Round 1
        if (Math.random() < 0.33) {
            olhos.notificarObservadores("O eclipse lunar iniciou");
        } else if (Math.random() < 0.67) {
            olhos.notificarObservadores("Encontramos uma alga rara");
        } else {
            olhos.notificarObservadores("Nada a revelar");
        }

        // Round 2
        if (Math.random() < 0.33) {
            olhos.notificarObservadores("O eclipse lunar terminou");
        } else if (Math.random() < 0.67) {
            olhos.notificarObservadores("Nada a revelar");
        } else {
            olhos.notificarObservadores("Encontramos o Wally");
        }
    }
}
