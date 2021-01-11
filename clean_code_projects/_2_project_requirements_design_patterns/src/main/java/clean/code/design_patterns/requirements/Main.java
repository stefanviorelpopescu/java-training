package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        Cozonac c1 = new Cozonac.Builder("simplu")
                .umplutura("mac")
                .topping("nuca").build();
        Cozonac c2 = new Cozonac.Builder("cacao")
                .umplutura("nuca")
                .topping("merisoare").build();
        Cozonac c3 = new Cozonac.Builder("simplu")
                .topping("nuca").build();
        Cozonac c4 = new Cozonac.Builder("cacao")
                .umplutura("mac").build();
        Client client = new Client("Ionescu Ana");

        Curier curier = new Curier("Cargus");

        ComandaOnline comanda = new ComandaOnline(c1);
        comanda.attach(client);
        comanda.attach(curier);
        comanda.setStatus("comanda a fost predata depozitului central");
        comanda.setStatus("datele comenzii au fost prelucrate");
        comanda.setStatus("comanda a fost predata curierului");
        comanda.setStatus("comanda conzonac "+ comanda.getCozonac().getAluat()+ " umplut cu "+
                comanda.getCozonac().getUmplutura()+" si decorat cu "+comanda.getCozonac().getTopping()+ " a fost livrata clientului");
        System.out.println("\n\n\n");
        ComandaOnline comanda2 = new ComandaOnline(c4);
        comanda2.attach(client);
        comanda2.attach(curier);
        comanda2.setStatus("comanda a fost predata depozitului central");
        comanda2.setStatus("datele comenzii au fost prelucrate");
        comanda2.setStatus("comanda a fost predata curierului");
        comanda2.setStatus("comanda conzonac "+ comanda2.getCozonac().getAluat()+ " umplut cu "+
                comanda2.getCozonac().getUmplutura()+" si decorat cu "+comanda2.getCozonac().getTopping()+ " a fost livrata clientului");


    }
}
