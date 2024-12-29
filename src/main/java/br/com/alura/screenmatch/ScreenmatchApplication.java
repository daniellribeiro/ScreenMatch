
package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

        public static void main(String[] args) {
            SpringApplication.run(ScreenmatchApplication.class, args);
        }

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		//System.out.println(principal.exibeMenu());
		principal.exibeTemporadas();

		//List<String> nomes = Arrays.asList("Jacque","Iasmin","Paulo","Rodrigo","Nico");
		//nomes.stream()
		//		.sorted()
		//		.limit(3)
		//		.filter(n -> n.startsWith("N"))
		//		.map(String::toUpperCase)
		//		.forEach(System.out::println);
	}
}