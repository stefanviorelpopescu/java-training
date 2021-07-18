package clean.code.design_patterns.requirements.facade_pattern;

public class Earring implements Jewelry {
    @Override
    public void jewelryModel() {
        System.out.println("Silver bracelet");
    }

    @Override
    public void price() {
        System.out.println("100$");
    }
}
