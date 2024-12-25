package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=687abcb1";

    public DadosSerie exibeMenu(){
        System.out.println("Digite o nome da serie para busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumoAPI.obterDados(ENDERECO + nomeSerie.replace(" ","+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json,DadosSerie.class);
        return dados;
    }

    public void exibeTemporadas(){
        List<DadosTemporada> temporadas = new ArrayList<DadosTemporada>();
        DadosSerie dados = this.exibeMenu();
        for(int i = 1; i <= dados.totalTemporadas(); i++){
            var json = consumoAPI.obterDados(ENDERECO + dados.titulo().replace(" ","+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }

        temporadas.forEach(t -> {
            System.out.println("Temporada " + t.numero());
            t.episodios().forEach(e -> System.out.println(e.numero() +
                    " ==> " + e.titulo()));
        });

        //for(int i = 0; i < temporadas.size(); i++){
        //    System.out.println("Temporada: " + (i+1));
        //    List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
        //    for(int j = 0; j < episodiosTemporada.size(); j++){
        //        System.out.println(episodiosTemporada.get(j).numero() + " => "
        //                + episodiosTemporada.get(j).titulo());
        //    }
        //}
    }
}
