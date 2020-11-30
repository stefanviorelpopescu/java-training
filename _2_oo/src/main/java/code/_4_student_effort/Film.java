package code._4_student_effort;

public class Film {
    Integer anApartie;
    String nume;
    Actor[] actori;

    // Explicit declaration of constructor with no parameters
    public Film() {

    }

    // Constructor with 3 paramaters
    public Film(Integer anApartie, String nume, Actor[] actori) {
        this.anApartie = anApartie;
        this.nume = nume;
        // Deep copy lista de actori
        this.actori = new Actor[actori.length];
        for (int i = 0; i < actori.length; i++) {
            this.actori[i] = new Actor(actori[i]);
        }
    }

    // Copy constructor
    public Film(Film film) {
        this.anApartie = film.anApartie;
        this.nume = film.nume;
        // Deep copy lista de actori
        this.actori = new Actor[film.actori.length];
        for (int i = 0; i < actori.length; i++) {
            this.actori[i] = new Actor(film.actori[i]);
        }
    }
}
