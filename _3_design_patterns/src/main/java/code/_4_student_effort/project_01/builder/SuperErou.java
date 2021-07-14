package code._4_student_effort.project_01.builder;

public class SuperErou {

    private String nume;
    private int puncteViata;

    private boolean esteErouNegativ;
    private boolean esteRanit;

    private InterfataArma armaStanga;
    private InterfataArma armaDreapta;

    private InterfataSuperPutere superPutere;
    private InterfataSuperPutere superSuperPutere;

    private SuperErou() {

    }

    private SuperErou(
            String nume,
            int puncteViata,
            boolean esteErouNegativ,
            boolean esteRanit,
            InterfataArma armaStanga,
            InterfataArma armaDreapta,
            InterfataSuperPutere superPutere,
            InterfataSuperPutere superSuperPutere) {
        super();
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.esteErouNegativ = esteErouNegativ;
        this.esteRanit = esteRanit;
        this.armaStanga = armaStanga;
        this.armaDreapta = armaDreapta;
        this.superPutere = superPutere;
        this.superSuperPutere = superSuperPutere;
    }

    //nu fac metode set pentru a schimba starea, fac clase apelam atributele si schimbam starea lor
    //toate medotele returneaza referinta catre builder

    //clasa in clasa SuperErou, astfel putem apela constructorul default privat de mai sus
    public static class SuperErouBuilder {

        SuperErou superErou = null;

        //eager instantion
        public SuperErouBuilder(String nume, int puncteViata) {
            superErou = new SuperErou();
            superErou.nume = nume;
            superErou.puncteViata = puncteViata;
        }

        public SuperErouBuilder esteNegativ() {
            this.superErou.esteErouNegativ = true;        //pentru ca default este false
            return this;
        }

        public SuperErouBuilder esteRanit() {
            this.superErou.esteRanit = true;        //pentru ca default este false
            return this;
        }

        public SuperErouBuilder setArmaStanga(InterfataArma arma) {
            this.superErou.armaStanga = arma;
            return this;
        }

        public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
            this.superErou.armaDreapta = arma;
            return this;
        }

        public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
            this.superErou.superPutere = superPutere;
            return this;
        }

        public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
            this.superErou.superSuperPutere = superSuperPutere;
            return this;
        }

        //lazy instantion daca construiesc superErou-ul la final, aici
        public SuperErou build() {
            return superErou;
        }
    }
}
