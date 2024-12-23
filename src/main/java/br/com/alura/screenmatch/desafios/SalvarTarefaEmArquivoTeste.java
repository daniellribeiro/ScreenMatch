package br.com.alura.screenmatch.desafios;

import java.io.FileReader;

public class SalvarTarefaEmArquivoTeste {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Reuniao",true,"Daniel");
        tarefa.serializarESalvarTarefaEmArquivo();
        Tarefa tarefaLida = tarefa.lerTarefaEmArquivoEDesserializar();
        System.out.println(tarefaLida);
    }
}
