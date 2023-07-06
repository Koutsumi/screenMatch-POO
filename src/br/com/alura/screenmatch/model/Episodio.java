package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classivicavel;

public class Episodio implements Classivicavel {
    private int number;
    private String name;
    private Serie serie;
    private int totalVisualizacao;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacao > 100){
            return 4;
        }else {
            return 2;
        }

    }
}
