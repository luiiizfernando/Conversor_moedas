import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Requisicao {

    public double requisicao(String url_str)
    {
        double taxaDeConversao = 0.0;
        try {
            // Fazendo requisição
            URL url = new URL(url_str);
            HttpURLConnection request = (HttpURLConnection) url.openConnection();
            request.connect();

            // Converter para JSON
            JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
            JsonObject jsonobj = root.getAsJsonObject();

            // Acessando objeto
            String req_result = jsonobj.get("result").getAsString();

            // Acessando a taxa de conversão
            if (req_result.equals("success"))
            {
                taxaDeConversao = jsonobj.get("conversion_rate").getAsDouble();
            }
            else
            {
                System.out.println("Falha na conversão.");
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return taxaDeConversao;
    }
}
