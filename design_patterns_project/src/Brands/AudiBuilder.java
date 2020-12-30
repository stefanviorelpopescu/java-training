package Brands;

public class AudiBuilder {
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

    public AudiBuilder(String ownerName) {
        this.ownerName = ownerName;
    }

    public AudiBuilder withAutoAirCondition() {
        this.autoAirCondition = true;
        return this;
    }

    public AudiBuilder withLeatherSeats() {
        this.leatherSeats = true;
        return this;
    }

    public AudiBuilder withSunRoof() {
        this.sunRoof = true;
        return this;
    }

    public AudiBuilder withBackupCamera() {
        this.backupCamera = true;
        return this;
    }

    public AudiBuilder withNavigationSystem() {
        this.navigationSystem = true;
        return this;
    }

    public AudiBuilder withBluetooth() {
        this.bluetooth = true;
        return this;
    }

    public AudiBuilder withRemoteStart() {
        this.remoteStart = true;
        return this;
    }

    public AudiBuilder withBlindSpotMonitoring() {
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

    public Audi build() {
        return new Audi(this);
    }
}