package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;

public class NumerosPrimosOrdemCresc {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        //código para filtrar e ordenar números primos
        List<Integer> listaNumerosNova =
                listaDeNumeros.stream()
                        .flatMap(List::stream)
                        .filter(NumerosPrimosOrdemCresc::verificarPrimo)
                        .toList();

        listaNumerosNova.forEach(System.out::println);
    }
    public static boolean verificarPrimo(Integer numero){
        int contador = 0;
        for(int i = 2 ; i < numero ; i++){
            if(numero % i == 0)
                contador++;
        }
        return contador == 0;
    }
}
