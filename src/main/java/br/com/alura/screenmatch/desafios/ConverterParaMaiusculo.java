package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;

public class ConverterParaMaiusculo {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        // código para conversão
        palavras
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
