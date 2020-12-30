package Brands;

import Car.Car;

public class BrandsFactory {

    public static Car getCar(String type, String ownerName) {

        if ("BMW-essential".equals(type)) {
            return new BMWBuilder(ownerName)
                    .build();
        }
        if ("BMW-comfort".equals(type)) {
            return new BMWBuilder(ownerName)
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withBlindSpotMonitoring()
                    .build();
        }

        if ("BMW-prestige".equals(type)) {
            return new BMWBuilder(ownerName)
                    .withAutoAirCondition()
                    .withLeatherSeats()
                    .withSunRoof()
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withRemoteStart()
                    .withBlindSpotMonitoring()
                    .build();
        }

        if ("Audi-prestige".equals(type)) {
            return new AudiBuilder(ownerName)
                    .withAutoAirCondition()
                    .withLeatherSeats()
                    .withSunRoof()
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withRemoteStart()
                    .withBlindSpotMonitoring()
                    .build();
        }

        if ("Audi-comfort".equals(type)) {
            return new AudiBuilder(ownerName)
                    .withBackupCamera()
                    .withNavigationSystem()
                    .withBluetooth()
                    .withBlindSpotMonitoring()
                    .build();
        }

        if ("Audi-essential".equals(type)) {
            return new AudiBuilder(ownerName)
                    .build();
        }

        return null;
    }
}
