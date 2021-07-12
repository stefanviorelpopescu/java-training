package factoryPattern;

public class Production {
    public static void main(String[] args){
        ToyProductionFactory toyProductionFactory=new ToyProductionFactory();
        ToyType toyType=toyProductionFactory.createToy("Plush");
        toyType.creatingToy();
    }
}
