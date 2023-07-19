package br.com.alura.screenmatch.model;

import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    @SerializedName("Title")
    private String title;
    private String resume;
    @SerializedName("Year")
    private int year;
    private boolean includePlan;
    private double score;
    private int totalScore;
    private int time;

    public Title(String title, int year) {
        this.title = title;
        this.year = year;
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
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
