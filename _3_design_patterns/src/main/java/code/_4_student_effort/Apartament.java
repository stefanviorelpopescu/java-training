package code._4_student_effort;

public class Apartament {
    private String locatie;
    private int chirie;

    public Apartament(String locatie, int chirie) {
        this.locatie = locatie;
        this.chirie = chirie;
    }

    public int getChirie() {
        return chirie;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "locatie='" + locatie + '\'' +
                ", chirie=" + chirie +
                '}';
    }
}
