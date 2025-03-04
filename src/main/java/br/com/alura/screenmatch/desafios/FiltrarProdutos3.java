package br.com.alura.screenmatch.desafios;

import java.util.*;
import java.util.stream.Collectors;

public class FiltrarProdutos3 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        Map<String, List<Produto>> produtoNovo =
                produtos.stream()
                        .collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(produtoNovo);

        Map<String,Long> produtoNovo2 =
                produtos.stream()
                        .collect(Collectors.groupingBy(Produto::getCategoria,Collectors.counting()));
        System.out.println(produtoNovo2);

        Map<String,Optional<Produto>> produtoNovo3 =
                produtos.stream()
                        .collect(Collectors.groupingBy(Produto::getCategoria,
                                Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
        System.out.println(produtoNovo3);

        Map<String,Double> produtoNovo4 =
                produtos.stream()
                        .collect(Collectors.groupingBy(Produto::getCategoria,
                                Collectors.summingDouble(Produto::getPreco)));
        System.out.println(produtoNovo4);
    }
}
