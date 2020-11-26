package code._4_student_effort;

public class Studio {
    String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public Integer getNoOfMovies(){
        return filme.length;
    }

    public String getNume() {
        return nume;
    }


    public static String checkStudio(Studio[] studioDatabase){
        String studioOutput = "";

        for (Studio studio : studioDatabase)
        {
            if (studio.getNoOfMovies() > 2 )
                studioOutput += studio.nume + " ";
        }

        return "Studios with more than two movies: " + studioOutput;
    }

    public static String checkActor(Studio [] studioDatabase) {
        String studioOutput = "";

        for (Studio studio : studioDatabase)
            for (Film movie : studio.filme)
                for (Actor actor : movie.actori)
                    if (actor.getNume().equals("Actor cu 2 Oscar-uri"))
                            studioOutput += studio.nume + " ";


        return "Studios where Actor cu 2 Oscar-uri played: " +studioOutput;
    }

    public static String checkMovie(Studio[] studioDatabase) {
        String movieOutput = "";

        for (Studio studio : studioDatabase)
            for (Film movie : studio.filme)
                for (Actor actor : movie.actori)
                    if (actor.getVarsta() > 50 ) {
                        movieOutput += " " + movie.nume + "\n";
                        break;
                    }


        return "Movies in which plays at least an actor with age above 50:  \n" + movieOutput;

    }

}
