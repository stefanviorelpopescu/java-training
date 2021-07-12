package factoryPattern;

public class ToyCar extends ToyType{
    @Override
    void creatingToy() {
        System.out.println("Creating toy car");
    }
}
