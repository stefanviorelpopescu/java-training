package Brands;

import Car.Car;

public class Audi extends Car {

    protected Audi(AudiBuilder builder) {
        setOwnerName(builder.getOwnerName());
        setBrand("Audi");
        setPrice(10500);        // starting price for an Audi

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
