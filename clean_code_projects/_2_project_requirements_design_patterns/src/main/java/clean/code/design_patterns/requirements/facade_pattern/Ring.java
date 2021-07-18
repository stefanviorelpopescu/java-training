package clean.code.design_patterns.requirements.facade_pattern;

public class Ring implements Jewelry {
    @Override
    public void jewelryModel() {
        System.out.println("Silver ring");
    }

    @Override
    public void price() {
        System.out.println("50$");
    }
}
