package code._ice_cream_shop_project;

public class IceCreamFactory {
    // singleton
    private static IceCreamFactory instance;
    private IceCreamFactory() {}
    public static IceCreamFactory getInstance() {
        if (instance == null) {
            instance =  new IceCreamFactory();
        }
        return instance;
    }

    public enum IceCreamType {
        Chocolate, Vanilla, Strawberry
    }

    public IceCream choseIceCream(IceCreamType type) {
        switch(type) {
            case Chocolate: return new Chocolate();
            case Vanilla: return new Vanilla();
            case Strawberry: return new Strawberry();
        }
        return null;
    }
}
