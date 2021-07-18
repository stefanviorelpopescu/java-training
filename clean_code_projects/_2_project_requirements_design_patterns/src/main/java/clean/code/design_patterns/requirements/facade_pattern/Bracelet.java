package clean.code.design_patterns.requirements.facade_pattern;

public class Bracelet implements Jewelry {
    @Override
    public void jewelryModel() {
        System.out.println("Silver bracelet with swarovski");
    }

    @Override
    public void price() {
        System.out.println("250$");
    }
}
