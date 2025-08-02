# Desafio Java

## Consultando a tabela FIPE

Vamos implementar uma aplicação para consultar o valor médio de veículos (carros, motos ou caminhões) de acordo com a tabela FIPE, que pode ser acessada através [desse site](https://veiculos.fipe.org.br/).

- A consulta aos valores dos veículos pelo site tem o seguinte fluxo:
- Primeiramente é necessário escolher o tipo do veículo: carro, moto ou caminhão.

![image](https://github.com/user-attachments/assets/69398006-5b7d-4be4-8187-4aaa1141467f)


- Depois disso, é necessário preencher a MARCA, MODELO e ANO para consulta.

![image](https://github.com/user-attachments/assets/c885958d-f519-4a40-9463-5860b8bcdba1)



- Por fim, é exibida a avaliação apenas daquele ano escolhido.

  ![image](https://github.com/user-attachments/assets/c95872e1-f8f7-447e-8677-008aecf775c3)


## 🔨 Objetivos do projeto

- O objetivo do projeto é ter um fluxo similar ao que é feito no site, porém com algumas melhorias.
- Criaremos um projeto Spring com linha de comando, utilizando a classe Scanner para fazer interações com o usuário via terminal.
- Solicitaremos que o usuário digite o tipo de veículo desejado (carro, caminhão ou moto).
- Feito isso, listaremos todas as marcas daquele tipo de veículo, solicitando que o usuário escolha uma marca pelo código.
- Após essa escolha, listaremos todos os modelos de veículos daquela marca.
- Solicitaremos que o usuário digite um trecho do modelo que ele quer visualizar, por exemplo **PALIO**.
- Listaremos apenas os modelos que tiverem a palavra **PALIO** no nome.
- Usuário escolherá um modelo específico pelo código e, diferente do site, já listaremos as avaliações para **TODOS** os anos disponíveis daquele modelo, retornando uma lista de forma similar à imagem abaixo:

![image](https://github.com/user-attachments/assets/4b9f2728-e45a-42f3-8145-6b240c609633)


## Observações:

- Para realização do desafio faremos o consumo de uma API, documentada [nesse link](https://deividfortuna.github.io/fipe/).

- Conforme o escolhido (carro, moto, ou caminhão) vamos fazer uma chamada a um dos endpoints abaixo para buscar as marcas:

https://parallelum.com.br/fipe/api/v1/carros/marcas

https://parallelum.com.br/fipe/api/v1/motos/marcas

https://parallelum.com.br/fipe/api/v1/caminhoes/marcas

- O retorno dessa requisição será uma lista com código e marca desejada. Caso o usuário queira por exemplo fazer uma consulta a modelos de carros da Fiat, que possui o código 21, terá que fazer uma nova requisição para o endpoint:

https://parallelum.com.br/fipe/api/v1/carros/marcas/56/modelos

- Feito isso, irá escolher um código de modelo, por exemplo esse **Palio Weekend Stile 1.6 mpi 16V 4p**, representado pelo código 560. Então deverá fazer uma terceira requisição para o endpoint:

https://parallelum.com.br/fipe/api/v1/carros/marcas/56/modelos/10927/anos

- Para saber a avaliação para cada ano disponível, teremos que fazer requisições pelo código por ano, onde obteremos um retorno similar ao que é mostrado abaixo:
- 
https://parallelum.com.br/fipe/api/v1/carros/marcas/56/modelos/10927/anos/32000-3
![image](https://github.com/user-attachments/assets/24efc1f3-4823-4f1e-93e7-66f33c785664)



 



