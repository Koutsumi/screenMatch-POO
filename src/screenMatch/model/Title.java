package screenMatch.model;

public class Title {
    private String title;
    private String resume;
    private int year;
    private boolean includePlan;
    private double score;
    private int totalScore;
    private int time;

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
}
