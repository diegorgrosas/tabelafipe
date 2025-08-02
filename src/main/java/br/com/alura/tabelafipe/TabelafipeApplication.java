package br.com.alura.tabelafipe;

import br.com.alura.tabelafipe.model.DadosGerais;
import br.com.alura.tabelafipe.model.DadosModelos;
import br.com.alura.tabelafipe.principal.Principal;
import br.com.alura.tabelafipe.service.ConsumoApi;
import br.com.alura.tabelafipe.service.ConverteDados;
import ch.qos.logback.core.encoder.JsonEscapeUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
public class TabelafipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TabelafipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
//		private Scanner leitura = new Scanner(System.in);
//		private ConsumoApi consumo = new ConsumoApi();
//		private ConverteDados conversor = new ConverteDados();
//
//		final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
//		private final String API_KEY = "&apikey=1b5249b2";



//		System.out.println(veiculo);

//		var enderecoCompleto = ENDERECO + veiculo + "/marcas";
//		System.out.println(enderecoCompleto);
//
//		var json = consumoApi.obterDados( ENDERECO + veiculo + "/marcas");
////		System.out.println("\n" + json);
//
//		ConverteDados conversor = new ConverteDados();
////		DadosGerais dados = conversor.obterDados(json, DadosGerais.class);
////		System.out.println(dados);
//		List<DadosGerais> lista = conversor.obterListaDados(json, new TypeReference<List<DadosGerais>>() {});
//		System.out.println(lista);
//
//		lista.forEach(dado ->
//				System.out.println("Cód: " + dado.codMarca() + " Descrição: " + dado.nome()));
//
//		System.out.print("Digite o código da marca para consulta: ");
//		var codigoMarca = leitura.nextLine();
//
//		var consultaModelos = consumoApi.obterDados( ENDERECO + veiculo + "/marcas/" + codigoMarca + "/modelos");
//
//		List<DadosModelos> listaModelos = conversor.obterListaDados(consultaModelos, new TypeReference<List<DadosModelos>>() {});
//		System.out.println(listaModelos);
//
//		listaModelos.forEach(dado ->
//				System.out.println("Cód: " + dado.codModelo() + " Descrição: " + dado.nomeModelo()));
	}
}
