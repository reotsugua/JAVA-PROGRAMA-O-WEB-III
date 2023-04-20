package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Animal leao = new Animal("carnívoro", "vivíparo", "terrestre", 180, 2.5);
        Animal vaca = new Animal("herbívoro", "vivíparo", "terrestre", 500, 1.5);
        Animal cavalo = new Animal("herbívoro", "vivíparo", "terrestre", 600, 1.7);
        Animal elefante = new Animal("herbívoro", "vivíparo", "terrestre", 5000, 3.5);
        Animal pinguim = new Animal("carnívoro", "ovíparo", "aquático", 10, 0.6);
        Animal tucano = new Animal("carnívoro", "ovíparo", "aéreo", 0.5, 0.3);
        Animal crocodilo = new Animal("carnívoro", "ovíparo", "aquático", 700, 3.2);
        Animal tartaruga = new Animal("herbívoro", "ovíparo", "aquático", 50, 0.8);



        List<Animal> animais = Arrays.asList(leao, vaca, cavalo, elefante, pinguim, tucano, crocodilo, tartaruga);
        double pesoMinimo = 200;

        List<Animal> herbivorosPesados = animais.stream()
                .filter(a -> a.getAlimentacao().equals("herbívoro"))
                .filter(a -> a.getPeso() > pesoMinimo)
                .collect(Collectors.toList());

        List<Animal> oviparosNaoAereos = animais.stream()
                .filter(a -> a.getReproducao().equals("ovíparo"))
                .filter(a -> !a.getLocomocao().equals("aéreo"))
                .collect(Collectors.toList());



        Optional<Animal> animalMaisPesado = animais.stream()
                .filter(a -> a.getAlimentacao().equals("herbívoro"))
                .max(Comparator.comparingDouble(Animal::getPeso));







    }
}