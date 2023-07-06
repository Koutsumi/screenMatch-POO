package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classivicavel;

public class Movie extends Title implements Classivicavel {

    private String director;

    public Movie(String title, int year){
        super(title, year);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) getScore() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getTitle() + "(" + this.getYear() + ")";
    }
}
