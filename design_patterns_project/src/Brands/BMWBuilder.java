package Brands;

public class BMWBuilder {
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

    public BMWBuilder(String ownerName) {
        this.ownerName = ownerName;
    }

    public BMWBuilder withAutoAirCondition() {
        this.autoAirCondition = true;
        return this;
    }

    public BMWBuilder withLeatherSeats() {
        this.leatherSeats = true;
        return this;
    }

    public BMWBuilder withSunRoof() {
        this.sunRoof = true;
        return this;
    }

    public BMWBuilder withBackupCamera() {
        this.backupCamera = true;
        return this;
    }

    public BMWBuilder withNavigationSystem() {
        this.navigationSystem = true;
        return this;
    }

    public BMWBuilder withBluetooth() {
        this.bluetooth = true;
        return this;
    }

    public BMWBuilder withRemoteStart() {
        this.remoteStart = true;
        return this;
    }

    public BMWBuilder withBlindSpotMonitoring() {
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

    public BMW build() {
        return new BMW(this);
    }
}