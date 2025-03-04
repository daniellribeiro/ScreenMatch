package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SomaDosQuadradosNumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        // código da filtragem e agrupamento dos dados
        Optional<Integer> soma = numeros.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * e)
                .reduce(Integer::sum);

        soma.ifPresent(integer -> System.out.println("A soma e : " + integer));
    }
}
