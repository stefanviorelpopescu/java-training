package code.proiect;

public class Curier implements Observer {
     private String nume;

    public Curier(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(ComandaOnline c) {
        System.out.println(nume + " a primit notificarea  " + c.getStatus());

    }
}
