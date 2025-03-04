package br.com.alura.screenmatch.desafios;

import java.util.*;
import java.util.stream.Collectors;

public class OrdernarNumeroCaracteres {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        // código do agrupamento

        Map<Integer, List<String>> agrupamento = palavras.stream()
                                                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupamento);
        // Resultado Esperado: {4=[java, code], 6=[stream, lambda]}
    }
}
