package br.com.alura.screenmatch.desafios;

import br.com.alura.screenmatch.model.Episodio;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);

        // código do agrupamento
        IntSummaryStatistics numerosEstatistica = numeros.stream()
                .collect(Collectors.summarizingInt(e -> e));

        System.out.println("O maior numero e " + numerosEstatistica.getMax());
    }
}
