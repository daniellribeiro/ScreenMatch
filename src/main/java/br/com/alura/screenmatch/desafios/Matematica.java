package br.com.alura.screenmatch.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) throws Exception {
        Scanner leitura = new Scanner(System.in);
        Integer numero1;
        Integer numero2;

        System.out.println("Digite o 1 numero: ");
        numero1 = leitura.nextInt();

        System.out.println("Digite o 2 numero: ");
        numero2 = leitura.nextInt();

        IMultiplicar multiplicacao = (a, b) -> a * b;
        Integer resultado = multiplicacao.multiplicar(numero1,numero2);
        System.out.println(numero1 + " * " + numero2 + " = " + resultado);

        IPrimo primo = (a) -> {
            // Caso especial: números menores ou iguais a 1 não são primos
            if (a <= 1) return false;

            // O número 2 é primo
            if (a == 2) return true;

            // Verifique se o número é divisível por qualquer número de 2 até a raiz quadrada de num
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) return false;  // Se for divisível, não é primo
            }
            // Se não encontrou nenhum divisor, o número é primo
            return true;
        };
        System.out.println(resultado + " = É Primo: " + (primo.isPrimo(resultado) ? "Sim" : "Nao"));

        List<Integer> numeros = new ArrayList<Integer>();
        for(int i = 0; i <= 1000; i++)
            numeros.add(i);

        numeros.replaceAll(t -> t * 3);
        System.out.println(numeros);

        IDivisor divisor = (a,b) -> {
            if(b == 0) throw new Exception("NAO PODE DIVIDIR POR ZERO");
            return a / b;
        };

        try {
            System.out.println("A divisao e " + divisor.divisao(numero1, numero2));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
