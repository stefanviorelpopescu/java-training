package clean.code.design_patterns.requirements;

public class Client  implements  Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(ComandaOnline c) {
        System.out.println(nume + " a primit notificarea  " + c.getStatus());
    }
}
