import Brands.*;
import Car.Car;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Audi-prestige costs: " + BrandsFactory.getCar("Audi-prestige", "none").getTotalPrice());
            System.out.println("BMW-prestige costs: " + BrandsFactory.getCar("BMW-prestige", "none").getTotalPrice() + "\n");

            System.out.println("Audi-comfort costs: " + BrandsFactory.getCar("Audi-comfort", "none").getTotalPrice());
            System.out.println("BMW-comfort costs: " + BrandsFactory.getCar("BMW-comfort", "none").getTotalPrice() + "\n");

            System.out.println("Audi-essential costs: " + BrandsFactory.getCar("Audi-essential", "none").getTotalPrice());
            System.out.println("BMW-essential costs: " + BrandsFactory.getCar("BMW-essential", "none").getTotalPrice() + "\n");

            BMW john = new Builder("John")
                    .withAutoAirCondition()
                    .withBackupCamera()
                    .withBlindSpotMonitoring()
                    .withRemoteStart()
                    .withSunRoof()
                    .build(BMW.class);
            System.out.println(john.getOwnerName() + " " + john.toString() + "\n");

            Audi diana = new Builder("Diana")
                    .withBluetooth()
                    .withRemoteStart()
                    .withNavigationSystem()
                    .build(Audi.class);
            System.out.println(diana.getOwnerName() + " " + diana.toString() + "\n");

            Car mihaela = BrandsFactory.getCar("BMW-comfort", "Mihaela");
            System.out.println(mihaela.getOwnerName() + " " + mihaela.toString() + "\n");

            Car denisa = BrandsFactory.getCar("Audi-prestige", "Denisa");
            System.out.println(denisa.getOwnerName() + " " + denisa.toString() + "\n");

            Car iuli = BrandsFactory.getCar("Audi-essential", "Iulian");
            System.out.println(iuli.getOwnerName() + " " + iuli.toString() + "\n");

        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
