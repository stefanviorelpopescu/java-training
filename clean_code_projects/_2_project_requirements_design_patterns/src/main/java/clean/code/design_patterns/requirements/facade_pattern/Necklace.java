package clean.code.design_patterns.requirements.facade_pattern;

public class Necklace implements Jewelry {
    @Override
    public void jewelryModel() {
        System.out.println("Silver necklace with swarovski");
    }

    @Override
    public void price() {
        System.out.println("350$");
    }
}
