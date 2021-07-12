package factoryPattern;

public class BuildingBlocks extends ToyType{
    @Override
    void creatingToy() {
        System.out.println("Creating building blocks");
    }
}
