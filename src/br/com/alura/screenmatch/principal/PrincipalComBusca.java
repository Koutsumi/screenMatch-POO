package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Title;
import br.com.alura.screenmatch.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do filme:");
        String busca = leitura.nextLine();

        String endereco  ="http://www.omdbapi.com/?t=" + busca + "&apikey=f11977a7";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        String json = response.body();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        //Title meuTitulo = gson.fromJson(json, Title.class);
        TitleOmdb meuTituloOmdb = gson.fromJson(json, TitleOmdb.class);
        System.out.println(meuTituloOmdb);

        Title meuTitulo = new Title(meuTituloOmdb);
        System.out.println(meuTitulo);
    }
}
