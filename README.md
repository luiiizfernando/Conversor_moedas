# Conversor de Moeda

Este é um projeto de conversor de moeda desenvolvido em Java. O programa permite converter valores entre várias moedas utilizando a API ExchangeRate-API para obter as taxas de câmbio mais recentes.

## Funcionalidades

- Conversão de Dólar para Peso Argentino
- Conversão de Peso Argentino para Dólar
- Conversão de Dólar para Real Brasileiro
- Conversão de Real Brasileiro para Dólar
- Conversão de Dólar para Peso Colombiano
- Conversão de Peso Colombiano para Dólar

## Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado em sua máquina:

- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (Java Development Kit)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) ou outra IDE de sua preferência
- Conexão com a internet para fazer as requisições à API

## Instalação

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/conversor-moeda.git
    ```

2. Navegue até o diretório do projeto:

    ```bash
    cd conversor-moeda
    ```

3. Abra o projeto na sua IDE de preferência.

4. Adicione a biblioteca Gson ao seu projeto:

    - Faça o download do [Gson JAR](https://github.com/google/gson) e adicione-o ao seu projeto.

## Uso

1. Execute o método `main` da classe `Principal`.

2. O programa exibirá um menu com as opções de conversão disponíveis:

    ```
    **********************************************************
    Seja bem-vindo/a ao Conversor de Moeda :]
    
    1) Dólar =>>> Peso argentino
    2) Peso argentino =>>> Dólar
    3) Dólar =>>> Real brasileiro
    4) Real Brasileiro =>>> Dólar
    5) Dólar =>>> Peso colombiano
    6) Peso colombiano =>>> Dólar
    7) Sair
    Escolha uma opção válida
    **********************************************************
    ```

3. Selecione a opção desejada digitando o número correspondente e pressione Enter.

4. Digite o valor que deseja converter e pressione Enter. O programa exibirá o valor convertido.
