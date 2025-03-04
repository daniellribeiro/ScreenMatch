package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SepararParesEImpares {
    public static void main(String[] args) {
//        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//        // código do particionamento da lista
//
//        System.out.println("Os numeros pares sao: ");
//        numeros.stream()
//                .filter(e -> e % 2 == 0)
//                .forEach(System.out::println);
//
//        System.out.println("Os numeros impares sao: ");
//        numeros.stream()
//                .filter(e -> e % 2 != 0)
//                .forEach(System.out::println);

        //Resultado professor
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> particionado = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: " + particionado.get(true));  // Esperado: [2, 4, 6]
        System.out.println("Ímpares: " + particionado.get(false));

    }
}
