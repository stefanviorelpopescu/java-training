package clean.code.design_patterns.requirements;

public class Planner {
    private final String numeActivitate;
    private final String data;
    private final String oraInceput;
    private final String oraFinal;
    private final String descriere;
    private final String contact;

    public Planner(Builder builder) {
        this.numeActivitate = builder.numeActivitate;
        this.data = builder.data;
        this.oraInceput = builder.oraInceput;
        this.oraFinal = builder.oraFinal;
        this.descriere = builder.descriere;
        this.contact = builder.contact;
    }

    public String getNumeActivitate() {
        return numeActivitate;
    }

    public String getData() {
        return data;
    }

    public String  getOraInceput() {
        return oraInceput;
    }

    public String getOraFinal() {
        return oraFinal;
    }

    public String getDescriere() {
        return descriere;
    }

    public String getContact() {
        return contact;
    }
    public String toString() {
        return "Numele activitatii : " + numeActivitate + " Data activitatii : " + data +
                " Ora inceput : " + oraInceput + " Ora final " + oraFinal +
                " Descriere : " + descriere + " Contact : "  +contact ;
    }

    public static  class Builder{
        final String numeActivitate;
        final String data;
        final String oraInceput;
        final String oraFinal;
        String descriere;
        String contact;

        public Builder(String numeActivitate,String data, String oraInceput, String oraFinal) {
            this.numeActivitate = numeActivitate;
            this.data = data;
            this.oraInceput = oraInceput;
            this.oraFinal = oraFinal;
        }

        public Builder withDescriere(String descriere) {
            this.descriere = descriere;
            return this;
        }

        public Builder withContact(String contact) {
            this.contact = contact;
            return this;
        }
        public Planner build(){
            Planner planner =  new Planner(this);
            return planner;
        }
    }
}