package Brands;

public class AudiBuilder extends Builder{

    public AudiBuilder(String ownerName) {
        super(ownerName);
    }

    public Audi build() {
        return new Audi(this);
    }
}