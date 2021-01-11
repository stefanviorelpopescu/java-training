package clean.code.design_patterns.requirements;

public class Firma implements Observer{
    private String numeFirma;

    public Firma(String numeFirma) {
        this.numeFirma = numeFirma;
    }

    public void update(ComandaOnline c) {
        System.out.println(numeFirma + " a primit notificarea cu comanda "+ c.getStatus());
    }
}
