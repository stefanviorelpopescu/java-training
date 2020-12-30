package Brands;

import Car.Car;

public class BMW extends Car {

    protected BMW(BMWBuilder builder) {
        setOwnerName(builder.getOwnerName());
        setBrand("BMW");
        setPrice(9750);         // starting price for an BMW

        setAutoAirCondition(builder.isAutoAirCondition());
        setLeatherSeats(builder.isLeatherSeats());
        setSunRoof(builder.isSunRoof());
        setBackupCamera(builder.isBackupCamera());
        setNavigationSystem(builder.isNavigationSystem());
        setBluetooth(builder.isBluetooth());
        setRemoteStart(builder.isRemoteStart());
        setBlindSpotMonitoring(builder.isBlindSpotMonitoring());
    }
}
