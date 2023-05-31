public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();

        myMovie.setTitle("Space Jam");
        String resume = """
                Filme de basquete com Michael Jordan e o Pernalonga
                """;
        myMovie.setResume(resume);

        System.out.println(myMovie.getTitle());
        System.out.println(myMovie.getResume());
    }
}