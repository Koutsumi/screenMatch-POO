package screenMatch.model;

import screenmatch.calculos.Classivicavel;

public class Movie extends Title implements Classivicavel {

    private String director;

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
