package br.com.alura.tabelafipe.principal;

import br.com.alura.tabelafipe.model.DadosGerais;
import br.com.alura.tabelafipe.model.DadosModelos;
import br.com.alura.tabelafipe.service.ConsumoApi;
import br.com.alura.tabelafipe.service.ConverteDados;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu() {
        menu();
        var veiculo = leitura.nextLine();
        String endereco;

        if (veiculo.toLowerCase().contains("car")) {
            endereco = URL_BASE + "carros/marcas";
        } else if (veiculo.toLowerCase().contains("mo")) {
            endereco = URL_BASE + "motos/marcas";
        } else {
            endereco = URL_BASE + "caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);
        System.out.println("\n" + json);

		var marcas = conversor.obterLista(json, DadosGerais.class);

        marcas.stream()
                .forEach(dado -> System.out.println("Cód: " + dado.codigo() + "  Descrição: " + dado.nome()));


        System.out.print("\nDigite o código da marca para consulta: ");
		var codigoMarca = leitura.nextLine();

        endereco = endereco + "/" + codigoMarca + "/modelos";

        json = consumo.obterDados(endereco);
        var modeloLista = conversor.obterDados(json, DadosModelos.class);

        System.out.println("\nModelos dessa marca:  ");
        modeloLista.modelos().stream()
                .forEach(dado -> System.out.println("Cód: " + dado.codigo() + "  Descrição: " + dado.nome()));


        System.out.print("\nDigite o código da modelo para consultar valores: ");
        var codigoModelo = leitura.nextLine();

        endereco = endereco + "/" + codigoModelo + "/anos" ; // + id ex. 2014-3
        System.out.println(endereco);
        json = consumo.obterDados(endereco);
        System.out.println(json);

        var modelos = conversor.obterLista(json, DadosGerais.class);
        modelos.stream()
                .forEach(dado -> System.out.println("Cód: " + dado.codigo() + "  Descrição: " + dado.nome()));
    }
















    public void menu() {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("                            TABELA FIPE                                                     ");
        System.out.println("                CONSULTE O VALOR DO SEU VEÍCULO AQUI!                                       ");
        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("OPÇÕES DE VEÍCULOS");
        System.out.println("Carros");
        System.out.println("Motos");
        System.out.println("Caminhão");

        System.out.print("\nDigite uma das opções de veículos para consultar valores: ");
    }
}
