package org.example.observadores;

import org.example.Observador;

public class ObservadorCeu implements Observador {
    public void atualizar(String evento) {
        System.out.println("OBS-CEU: " + evento);
    }
}
