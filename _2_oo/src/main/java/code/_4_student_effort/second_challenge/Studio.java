package second_challenge;

public class Studio {

    private String nume;
    private Film[] filme;

    public Studio() { }

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public Film[] getFilme() {
        return filme;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setFilme(Film[] filme) {
        this.filme = filme;
    }

    public boolean hasTwoMovies() {
        return this.filme.length >= 2;
    }

    public void printStudiosWithActorName(Studio[] studios, String actorName) {
        for (Studio studio : studios) {
            found_actor:
            for (Film film : studio.getFilme())
                for (Actor actor : film.getActori())
                    if (actor.getNume().equals(actorName)) {
                        System.out.print(studio.getNume());
                        break found_actor;
                    }
        }
        System.out.println();
    }

    public void printFilmsWithActorAge(Film[] filme, Integer age) {
        for (Film film : filme) {
            for (Actor actor : film.getActori())
                if (actor.getVarsta() >= age) {
                    System.out.print(film.getNume());
                    break;
                }
        }
        System.out.println();
    }

    public void printStudiosWithTwoMovies(Studio[] studios) {
        for (Studio studio : studios) {
            if (studio.hasTwoMovies())
                System.out.print(studio.getNume());
        }
        System.out.println();
    }
}
