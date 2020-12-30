package Car;

public abstract class Features {
    private boolean autoAirCondition;
    private boolean leatherSeats;
    private boolean sunRoof;
    private boolean backupCamera;
    private boolean navigationSystem;
    private boolean bluetooth;
    private boolean remoteStart;
    private boolean blindSpotMonitoring;

    public boolean isAutoAirCondition() {
        return autoAirCondition;
    }

    public void setAutoAirCondition(boolean autoAirCondition) {
        this.autoAirCondition = autoAirCondition;
    }

    public boolean isLeatherSeats() {
        return leatherSeats;
    }

    public void setLeatherSeats(boolean leatherSeats) {
        this.leatherSeats = leatherSeats;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }

    public boolean isBackupCamera() {
        return backupCamera;
    }

    public void setBackupCamera(boolean backupCamera) {
        this.backupCamera = backupCamera;
    }

    public boolean isNavigationSystem() {
        return navigationSystem;
    }

    public void setNavigationSystem(boolean navigationSystem) {
        this.navigationSystem = navigationSystem;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isRemoteStart() {
        return remoteStart;
    }

    public void setRemoteStart(boolean remoteStart) {
        this.remoteStart = remoteStart;
    }

    public boolean isBlindSpotMonitoring() {
        return blindSpotMonitoring;
    }

    public void setBlindSpotMonitoring(boolean blindSpotMonitoring) {
        this.blindSpotMonitoring = blindSpotMonitoring;
    }
}
