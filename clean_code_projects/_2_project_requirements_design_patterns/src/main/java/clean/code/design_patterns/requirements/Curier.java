package clean.code.design_patterns.requirements;

public class Curier implements Observer{
    private String nume;

    public Curier(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(ComandaOnline c) {
        System.out.println(nume + " a primit notificarea  " + c.getStatus());

    }
}
