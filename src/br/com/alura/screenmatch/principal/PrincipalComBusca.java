package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.model.Title;
import br.com.alura.screenmatch.model.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Title> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        while(!busca.equalsIgnoreCase("sair")){

            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Digite o nome do filme:");
            busca = leitura.nextLine();

            String endereco  ="http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=f11977a7";
            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                //System.out.println(response.body());
                String json = response.body();


                //Title meuTitulo = gson.fromJson(json, Title.class);
                TitleOmdb meuTituloOmdb = gson.fromJson(json, TitleOmdb.class);
                //System.out.println(meuTituloOmdb);


                Title meuTitulo = new Title(meuTituloOmdb);
                //System.out.println(meuTitulo);

                titulos.add(meuTitulo);

            }catch(NumberFormatException e){
                System.out.println("Error");
                System.out.println(e.getMessage());
            }catch (IllegalArgumentException e){
                System.out.println("ERROR! Verifique o enderećo da busca");
            } catch (ErroDeConversaoDeAnoException e){
                System.out.println(e.getMensagem());
            }finally {
                System.out.println("Programa finalizado");
            }

        };
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();

    }
}
