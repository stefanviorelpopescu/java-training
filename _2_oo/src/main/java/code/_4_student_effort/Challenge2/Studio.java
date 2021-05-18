package code._4_student_effort.Challenge2;

public class Studio {
    public String nume;
    public Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return nume;
    }

    public boolean hasMoreThan2Movies() {
        int nrFilme = 0;

        for(Film film : filme) {
            nrFilme += 1;
        }

        if(nrFilme > 2) {
            return true;
        }

        return false;
    }

    public String filmeCuActoriPeste50() {
        String numeFilme = "";

        for(Film film : filme) {
            if(film.actoriPeste50Ani())
                numeFilme += film.getNume() + " ";
        }

        if(numeFilme == "") {
            return "Nici unul dintre filme nu are actori peste 50 de ani";
        }

        return numeFilme;
    }

    public boolean areActoriCuNumele(String nume) {
        for(Film film : filme) {
            if(film.areActoriCuNumele(nume)) return true;
        }
        return false;
    }
}
