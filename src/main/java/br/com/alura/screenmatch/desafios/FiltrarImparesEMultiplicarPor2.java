package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarImparesEMultiplicarPor2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código para filtragem e coleta
        List<Integer> numerosNovo = numeros.stream().filter(e -> e % 2 != 0)
                .map(e -> e * 2)
                .toList();

        System.out.println(numerosNovo);

    }
}
