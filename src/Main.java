import screenMatch.model.Movie;
import screenMatch.model.Serie;

public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();

        myMovie.setTitle("Space Jam");
        myMovie.setYear(1996);
        myMovie.setTime(90);
        String resume = """
                Filme de basquete com Michael Jordan e o Pernalonga
                """;
        myMovie.setResume(resume);

        System.out.println(myMovie.getTitle());
        System.out.println(myMovie.getResume());

        myMovie.evaluation(8);
        myMovie.evaluation(10);
        myMovie.evaluation(7);

        System.out.println(myMovie.getScore());
        System.out.println(myMovie.getTotalScore());
        System.out.println(myMovie.getAverage());

        Serie lost = new Serie();
        lost.setTitle("Lost");
        lost.setYear(2000);
        lost.setSeasons(10);
        lost.setEpisodes(22);
        lost.setEpisodeTime(40);
        System.out.println("Tempo de série " + lost.getTime() + "minutos");


    }
}