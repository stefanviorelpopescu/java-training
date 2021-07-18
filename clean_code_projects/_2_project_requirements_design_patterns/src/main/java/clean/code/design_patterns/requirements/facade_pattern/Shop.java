package clean.code.design_patterns.requirements.facade_pattern;

public class Shop {
    private Jewelry ring;
    private Jewelry bracelet;
    private Jewelry necklace;
    private Jewelry earring;

    public Shop() {
        ring = new Ring();
        bracelet = new Bracelet();
        necklace = new Necklace();
        earring = new Earring();
    }

    public void ringSale() {
        ring.jewelryModel();
        ring.price();
    }

    public void braceletSale() {
        bracelet.jewelryModel();
        bracelet.price();
    }

    public void necklaceSale() {
        necklace.jewelryModel();
        necklace.price();
    }

    public void earringSale() {
        earring.jewelryModel();
        earring.price();
    }
}
