package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenarComVirgula {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        // código do agrupamento de dados
        System.out.println(String.join(",", nomes));

        // Resultado Esperado: "Alice, Bob, Charlie"
    }
}
