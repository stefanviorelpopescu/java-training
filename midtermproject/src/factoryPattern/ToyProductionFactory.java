package factoryPattern;

public class ToyProductionFactory {
    public ToyType createToy(String toyType){
        if(toyType==null||toyType.isEmpty())
            return null;
        if("ToyCar".equals(toyType))
            return new ToyCar();
        if("Puzzle".equals(toyType))
            return  new Puzzle();
        if("Plush".equals(toyType))
            return new Plush();
        if("Doll".equals(toyType))
            return new Doll();
        if("BuildingBlocks".equals(toyType))
            return new BuildingBlocks();
        if("BadmintonSets".equals(toyType))
            return new BadmintonSets();
    return null;
    }

}
