package third_challenge;

public class Spider extends Animal{

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider eating is disgusting.");
    }
}
