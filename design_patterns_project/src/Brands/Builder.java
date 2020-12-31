package Brands;

import Car.Car;

import java.lang.reflect.InvocationTargetException;

public class Builder {
    private String ownerName;

    // extras
    private boolean autoAirCondition;
    private boolean leatherSeats;
    private boolean sunRoof;
    private boolean backupCamera;
    private boolean navigationSystem;
    private boolean bluetooth;
    private boolean remoteStart;
    private boolean blindSpotMonitoring;

    public Builder(String ownerName) {
        this.ownerName = ownerName;
    }

    public Builder withAutoAirCondition() {
        this.autoAirCondition = true;
        return this;
    }

    public Builder withLeatherSeats() {
        this.leatherSeats = true;
        return this;
    }

    public Builder withSunRoof() {
        this.sunRoof = true;
        return this;
    }

    public Builder withBackupCamera() {
        this.backupCamera = true;
        return this;
    }

    public Builder withNavigationSystem() {
        this.navigationSystem = true;
        return this;
    }

    public Builder withBluetooth() {
        this.bluetooth = true;
        return this;
    }

    public Builder withRemoteStart() {
        this.remoteStart = true;
        return this;
    }

    public Builder withBlindSpotMonitoring() {
        this.blindSpotMonitoring = true;
        return this;
    }

    public boolean isAutoAirCondition() {
        return autoAirCondition;
    }

    public boolean isLeatherSeats() {
        return leatherSeats;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public boolean isBackupCamera() {
        return backupCamera;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public boolean isRemoteStart() {
        return remoteStart;
    }

    public boolean isBlindSpotMonitoring() {
        return blindSpotMonitoring;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public <T extends Car> T build(Class<T> brandCar) {
        T carToBuild = null;

        try {
            carToBuild = brandCar.getConstructor(this.getClass()).newInstance(this);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return carToBuild;
    }
}