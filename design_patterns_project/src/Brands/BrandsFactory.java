package Brands;

import Car.Car;

public class BrandsFactory {

    public static Car getCar(String type, String ownerName) {

        if ("BMW-essential".equals(type)) {
            return new Builder(ownerName)
                    .build(BMW.class);
        }
        if ("BMW-comfort".equals(type)) {
            return new Builder(ownerName)
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withBlindSpotMonitoring()
                    .build(BMW.class);
        }

        if ("BMW-prestige".equals(type)) {
            return new Builder(ownerName)
                    .withAutoAirCondition()
                    .withLeatherSeats()
                    .withSunRoof()
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withRemoteStart()
                    .withBlindSpotMonitoring()
                    .build(BMW.class);
        }

        if ("Audi-prestige".equals(type)) {
            return new Builder(ownerName)
                    .withAutoAirCondition()
                    .withLeatherSeats()
                    .withSunRoof()
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withRemoteStart()
                    .withBlindSpotMonitoring()
                    .build(Audi.class);
        }

        if ("Audi-comfort".equals(type)) {
            return new Builder(ownerName)
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withBlindSpotMonitoring()
                    .build(Audi.class);
        }

        if ("Audi-essential".equals(type)) {
            return new Builder(ownerName)
                    .build(Audi.class);
        }

        return null;
    }
}
