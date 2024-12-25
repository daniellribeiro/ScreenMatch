package br.com.alura.screenmatch.desafios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Texto {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra: ");
        Scanner leitura = new Scanner(System.in);
        String texto = leitura.next();
        IMaiusculo maiusculo = String::toUpperCase;
        System.out.println(maiusculo.converteParaMaiusculo(texto));

        IPalindromo palindromo = (a) -> a.equals(new StringBuilder(a).reverse().toString());
        System.out.println(texto + " = E um palindromo: " + palindromo.palindromo(texto));

        ArrayList<String> listaTexto = new ArrayList<>();
        listaTexto.add("z");
        listaTexto.add("x");
        listaTexto.add("a");
        listaTexto.add("b");
        listaTexto.add("n");

        listaTexto.sort(String::compareTo);
        System.out.println(listaTexto);
    }
}
