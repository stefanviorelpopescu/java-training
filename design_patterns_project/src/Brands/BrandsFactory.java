package Brands;

import Car.Car;

public class BrandsFactory {

    public static Car getCar(String type, String ownerName) {

        if ("BMW-full".equals(type)) {
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

        if ("Audi-full".equals(type)) {
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

        return null;
    }
}
