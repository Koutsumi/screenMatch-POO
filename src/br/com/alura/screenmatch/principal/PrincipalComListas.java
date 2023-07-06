package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie primeiro_filme = new Movie("Avatar", 2022);
        primeiro_filme.evaluation(7);

        Movie segundo_filme = new Movie("Homem-aranha", 2023);
        segundo_filme.evaluation(9);

        Movie terceiro_filme = new Movie("Guardiões da Galaxia", 2023);
        terceiro_filme.evaluation(9);

        Serie primeira_serie = new Serie("Pretty Little Liars", 2012);
        primeira_serie.evaluation(7);

        ArrayList<Title> lista_assistidos = new ArrayList<>();
        lista_assistidos.add(primeiro_filme);
        lista_assistidos.add(segundo_filme);
        lista_assistidos.add(terceiro_filme);
        lista_assistidos.add(primeira_serie);
        //System.out.println(lista_assistidos);

        // lista_assistidos.forEach(item -> System.out.println(item));
        Collections.sort(lista_assistidos);
        for(Title item: lista_assistidos){
            System.out.println(item.getTitle());

            if(item instanceof Movie movie){
                System.out.println("Classicacao: " + movie.getClassificacao());
            }
        }



        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Jaqueline");
        buscaArtista.add("Fernanda");

        Collections.sort(buscaArtista);
        System.out.println("Depois de ordernar");
        System.out.println(buscaArtista);
    }
}

