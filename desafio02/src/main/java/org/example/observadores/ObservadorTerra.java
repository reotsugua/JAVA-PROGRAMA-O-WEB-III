package org.example.observadores;

import org.example.Observador;

public class ObservadorTerra implements Observador {
    public void atualizar(String evento) {
        System.out.println("OBS-TERRA: " + evento);
    }
}
