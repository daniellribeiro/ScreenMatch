package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;

public class FiltrarNumerosPares {
        public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
            // código para filtragem.
            numeros.stream().filter(e -> (e % 2) == 0).forEach(System.out::println);
        }
}
