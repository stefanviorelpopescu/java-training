package project_patterns;

//Main class with examples for Adaptor and Decorator
public class PositionAdapterExample {

    public static void main(String[] args) {
        testClassAdapter();
    }

    private static void testClassAdapter() {
        PositionAdapter posAdapter = new PositionClassAdapterImpl();
        Footballer f1 = getFootballer(posAdapter, "defensive");
        Footballer f2 = getFootballer(posAdapter, "passing");
        Footballer f3 = getFootballer(posAdapter, "shooting");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());

        EquippedFootballer footballer = new T_shirt(new Shorts(new Shoes(new Footballer(null, null))));
        System.out.println(footballer.equip());
    }

    private static Footballer getFootballer(PositionAdapter posAdapter, String ability) {
        switch (ability) {
            case "passing":
                return posAdapter.getPassingAbility();
            case "shooting":
                return posAdapter.getAttackingAbility();
            default:
                return posAdapter.getDefensiveAbility();
        }
    }

}
