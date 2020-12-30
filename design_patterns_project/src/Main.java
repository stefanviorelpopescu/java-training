import Brands.*;
import Car.Car;

public class Main {

    public static void main(String[] args) {

        System.out.println("Audi-full costs: " + BrandsFactory.getCar("Audi-full", "none").getTotalPrice());
        System.out.println("BMW-full costs: " + BrandsFactory.getCar("BMW-full", "none").getTotalPrice());

        BMW john = new BMWBuilder("John")
                .withAutoAirCondition()
                .withBackupCamera()
                .withBlindSpotMonitoring()
                .withRemoteStart()
                .withSunRoof()
                .build();
        System.out.println(john.getOwnerName() + " " + john.toString() + "\n");

        Car mihaela = BrandsFactory.getCar("BMW-full", "Mihaela");
        System.out.println(mihaela.getOwnerName() + " " + mihaela.toString() + "\n");

        Car denisa = BrandsFactory.getCar("Audi-full", "Denisa");
        System.out.println(denisa.getOwnerName() + " " + denisa.toString() + "\n");
    }
}
