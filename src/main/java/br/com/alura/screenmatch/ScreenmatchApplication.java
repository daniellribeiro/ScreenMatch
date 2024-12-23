
package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.alura.screenmatch.service.*;


@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

        public static void main(String[] args) {
            SpringApplication.run(ScreenmatchApplication.class, args);
        }

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoAPI = new ConsumoAPI();
		String json = consumoAPI.obterDados("https://www.omdbapi.com/?t=The+Big+Bang+Theory&apikey=687abcb1");
		//System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		//System.out.println(dados);

		json = consumoAPI.obterDados("https://www.omdbapi.com/?t=The+Big+Bang+Theory&season=1&episode=2&apikey=687abcb1");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json,DadosEpisodio.class);
		//System.out.println(dadosEpisodio);

		for(int i = 1; i <= dados.totalTemporadas(); i++){
			json = consumoAPI.obterDados("https://www.omdbapi.com/?t=The+Big+Bang+Theory&season="+ i + "&apikey=687abcb1");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			System.out.println(dadosTemporada);
		}
	}
}