package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;

public class RemoverDuplicados {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        // código da filtragem
        palavras.stream().distinct().forEach(System.out::println);
    }
}
