import Brands.*;
import Car.Car;

public class Main {

    public static void main(String[] args) {

        System.out.println("Audi-prestige costs: " + BrandsFactory.getCar("Audi-prestige", "none").getTotalPrice());
        System.out.println("BMW-prestige costs: " + BrandsFactory.getCar("BMW-prestige", "none").getTotalPrice());

        System.out.println("Audi-comfort costs: " + BrandsFactory.getCar("Audi-comfort", "none").getTotalPrice());
        System.out.println("BMW-comfort costs: " + BrandsFactory.getCar("BMW-comfort", "none").getTotalPrice());

        System.out.println("Audi-essential costs: " + BrandsFactory.getCar("Audi-essential", "none").getTotalPrice());
        System.out.println("BMW-essential costs: " + BrandsFactory.getCar("BMW-essential", "none").getTotalPrice());

        BMW john = new BMWBuilder("John")
                .withAutoAirCondition()
                .withBackupCamera()
                .withBlindSpotMonitoring()
                .withRemoteStart()
                .withSunRoof()
                .build();
        System.out.println(john.getOwnerName() + " " + john.toString() + "\n");

        Audi diana = new AudiBuilder("Diana")
                .withBluetooth()
                .withRemoteStart()
                .withNavigationSystem()
                .build();
        System.out.println(diana.getOwnerName() + " " + diana.toString() + "\n");

        Car mihaela = BrandsFactory.getCar("BMW-prestige", "Mihaela");
        System.out.println(mihaela.getOwnerName() + " " + mihaela.toString() + "\n");

        Car denisa = BrandsFactory.getCar("Audi-prestige", "Denisa");
        System.out.println(denisa.getOwnerName() + " " + denisa.toString() + "\n");
    }
}
