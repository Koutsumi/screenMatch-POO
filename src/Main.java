import screenMatch.model.Episodio;
import screenMatch.model.Movie;
import screenMatch.model.Serie;
import screenmatch.calculos.CalculadoraTempo;
import screenmatch.calculos.FiltroRecomendacao;

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

        Movie newMovie = new Movie();

        newMovie.setTitle("Space Jam");
        newMovie.setYear(1996);
        newMovie.setTime(100);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(newMovie);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumber(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(200);
        filtro.filtra(episodio);
    }
}