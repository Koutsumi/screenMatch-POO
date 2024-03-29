package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.execao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{

    private String title;
    private String resume;

    private int year;
    private boolean includePlan;
    private double score;
    private int totalScore;
    private int time;

    public Title(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Title(TitleOmdb meuTituloOmdb) {
        this.title = meuTituloOmdb.title();
        if(meuTituloOmdb.year().length() > 4 ){
            throw new ErroDeConversaoDeAnoException("Ano com mais de 4 caracteres");
        }
        this.year = Integer.parseInt(meuTituloOmdb.year());
        this.time = Integer.parseInt(meuTituloOmdb.runtime().substring(0,3));
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getResume() {
        return resume;
    }

    public void evaluation(double number){
        score += number;
        totalScore++;
    }

    public double getScore() {
        return score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverage(){
        return score / totalScore;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setIncludePlan(boolean includePlan) {
        this.includePlan = includePlan;
    }

    public boolean isIncludePlan() {
        return includePlan;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getTitle().compareTo(anotherTitle.getTitle());
    }

    @Override
    public String toString() {
        return "Title{" +
                "Título = '" + title + '\'' +
                ", Ano = " + year + '\'' + "Duracao = " + time +
                '}';
    }
}
