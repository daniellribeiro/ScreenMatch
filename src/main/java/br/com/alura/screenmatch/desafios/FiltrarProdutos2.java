package br.com.alura.screenmatch.desafios;

import java.util.Arrays;
import java.util.List;

public class FiltrarProdutos2 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> produtoNovo = produtos.stream()
                .filter(e -> e.getCategoria().equals("Eletrônicos"))
                .sorted((a,b) -> Double.compare(a.getPreco(),b.getPreco()))
                .limit(3)
                .toList();

        produtoNovo.forEach(System.out::println);
    }
}
