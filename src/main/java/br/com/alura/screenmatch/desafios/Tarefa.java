package br.com.alura.screenmatch.desafios;

import br.com.alura.screenmatch.service.ConverteDados;
import com.google.gson.JsonElement;

import java.io.*;

public class Tarefa {
    private String descricao;
    private boolean concluida;
    private String pessoaResponsavel;

    ConverteDados conversor = new ConverteDados();
    static String caminhoArquivo = "src/main/java/br/com/alura/screenmatch/desafios/tarefa.json";

    public Tarefa(String descricao, boolean concluida, String pessoaResponsavel) {
        this.descricao = descricao;
        this.concluida = concluida;
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public Tarefa(){

    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                ", pessoaResponsavel='" + pessoaResponsavel + '\'' +
                '}';
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void setPessoaResponsavel(String pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void serializarESalvarTarefaEmArquivo() {
        String json = conversor.serializarDados(this);
        try {
            FileWriter arquivo = new FileWriter(caminhoArquivo);
            arquivo.write(json);
            arquivo.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo!!!!");
        }
    }

    public Tarefa lerTarefaEmArquivoEDesserializar() {
       return conversor.obterDadosArquivo(caminhoArquivo, Tarefa.class);
    }
}
