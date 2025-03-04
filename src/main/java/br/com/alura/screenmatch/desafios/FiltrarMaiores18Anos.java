package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FiltrarMaiores18Anos {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19),
                new Pessoa("Bruna",52)
        );

        // código para filtrar pessoas
        pessoas.stream()
                .filter(e -> e.idade() > 18)
                .sorted((a,b) -> a.nome().compareTo(b.nome()))
                .forEach(e -> System.out.println(e.nome()));
    }
}
