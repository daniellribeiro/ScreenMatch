package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.*;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

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

        List<DadosEpisodio> dadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .toList();

        System.out.println("LISTA EPISODIOS DA TEMPORADA: ");
        List<Episodio> episodios = temporadas.stream().flatMap(t -> t.episodios().stream().
                map(d -> new Episodio(t.numero(),d))).toList();

        episodios.forEach(System.out::println);

        System.out.println("A partir de que ano voce deseja ver os episodios ");
        var ano = leitura.nextInt();

        LocalDate dataBusca = LocalDate.of(ano,1,1);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        episodios.stream().filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(dataBusca))
        .forEach(e -> {
            System.out.println(" Temporada: " + e.getTemporada() +
                    " Episodio: " + e.getTitulo() +
                    " Data Lancamento " + e.getDataLancamento().format(formatador));
        });
    }
}
