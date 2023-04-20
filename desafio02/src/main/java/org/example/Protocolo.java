package org.example;

import java.util.ArrayList;
import java.util.List;

public class Protocolo {
    private List<Observador> observadores = new ArrayList<Observador>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String evento) {
        for (Observador observador : observadores) {
            observador.atualizar(evento);
        }
    }
}
