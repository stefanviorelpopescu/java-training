package factoryPattern;

public class Doll extends ToyType {
    @Override
    void creatingToy() {
        System.out.println("Creating doll");
    }
}
