import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Principal {
    public static void main(String[] args) throws IOException {
        //Para fazer a leitura de dados do usuário
        Scanner leitura = new Scanner(System.in);

        // Criando uma instância da classe menu
        Menu menu = new Menu();

        // Criando uma instância de requisição
        Requisicao url_str = new Requisicao();

        // Declaração de váriaveis e/ou leitura junto
        int opcao = 0;
        //String url_str = "";
        double valor, taxaDeCambio;

        // Exibindo menu e tratando entrada inválida
        while (opcao != 7)
        {
            // Chamando o método displayMenu para exibir o menu do programa
            menu.displayMenu();
            System.out.print("Digite a opção desejada: ");

            try {
                // Pedindo dado do usuário
                opcao = leitura.nextInt();
                switch (opcao) {
                    case 1:
                        // Conversão de Dólar para Peso Argentino
                        // Configuração da URL para usar a API
                        taxaDeCambio = url_str.requisicao("https://v6.exchangerate-api.com/v6/1d211989f424c94365837181/pair/USD/ARS");
                        System.out.print("Digite o valor que deseja converter: ");
                        valor = leitura.nextFloat();
                        System.out.println("Valor " + valor + " [USD] " + "corresponde ao valor final de =>>> " + (taxaDeCambio * valor) + "[ARS]");
                        break;
                    case 2:
                        // Conversão de Peso Argentino para Dólar
                        // Configuração da URL para usar a API
                        taxaDeCambio = url_str.requisicao("https://v6.exchangerate-api.com/v6/1d211989f424c94365837181/pair/ARS/USD");
                        System.out.print("Digite o valor que deseja converter: ");
                        valor = leitura.nextFloat();
                        System.out.println("Valor " + valor + " [ARS] " + "corresponde ao valor final de =>>> " + (taxaDeCambio * valor) + "[USD]");
                        break;
                    case 3:
                        // Conversão de Dólar para Real Brasileiro
                        // Configuração da URL para usar a API
                        taxaDeCambio = url_str.requisicao("https://v6.exchangerate-api.com/v6/1d211989f424c94365837181/pair/USD/BRL");
                        System.out.print("Digite o valor que deseja converter: ");
                        valor = leitura.nextFloat();
                        System.out.println("Valor " + valor + " [USD] " + "corresponde ao valor final de =>>> " + (taxaDeCambio * valor) + "[BRL]");
                        break;
                    case 4:
                        // Conversão de Real Brasileiro para Dólar
                        // Configuração da URL para usar a API
                        taxaDeCambio = url_str.requisicao("https://v6.exchangerate-api.com/v6/1d211989f424c94365837181/pair/BRL/USD");
                        System.out.print("Digite o valor que deseja converter: ");
                        valor = leitura.nextFloat();
                        System.out.println("Valor " + valor + " [BRL] " + "corresponde ao valor final de =>>> " + (taxaDeCambio * valor) + "[USD]");
                        break;
                    case 5:
                        // Conversão de Dólar para Peso Colombiano
                        // Configuração da URL para usar a API
                        taxaDeCambio = url_str.requisicao("https://v6.exchangerate-api.com/v6/1d211989f424c94365837181/pair/USD/COP");
                        System.out.print("Digite o valor que deseja converter: ");
                        valor = leitura.nextFloat();
                        System.out.println("Valor " + valor + " [USD] " + "corresponde ao valor final de =>>> " + (taxaDeCambio * valor) + "[COP]");
                        break;
                    case 6:
                        // Conversão de Peso Colombiano para Dólar
                        // Configuração da URL para usar a API
                        taxaDeCambio = url_str.requisicao("https://v6.exchangerate-api.com/v6/1d211989f424c94365837181/pair/COP/USD");
                        System.out.print("Digite o valor que deseja converter: ");
                        valor = leitura.nextFloat();
                        System.out.println("Valor " + valor + " [COP] " + "corresponde ao valor final de =>>> " + (taxaDeCambio * valor) + "[USD]");
                        break;
                    case 7:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }

            }
            catch(InputMismatchException e)
            {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                leitura.next(); // Limpa a entrada inválida
            }
        }
    }
}
