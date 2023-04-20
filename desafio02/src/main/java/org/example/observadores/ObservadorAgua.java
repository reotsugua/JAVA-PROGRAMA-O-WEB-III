package org.example.observadores;

import org.example.Observador;

public class ObservadorAgua implements Observador {
    public void atualizar(String evento) {
        System.out.println("OBS-AGUA: " + evento);
    }
}
