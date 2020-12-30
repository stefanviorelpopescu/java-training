package Car;

public abstract class Car extends Features {
    private String brand;
    private String ownerName;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        if (isAutoAirCondition()) {
            setPrice(getPrice() + 1000);
        }
        if (isLeatherSeats()) {
            setPrice(getPrice() + 600);
        }
        if (isSunRoof()) {
            setPrice(getPrice() + 500);
        }
        if (isBackupCamera()) {
            setPrice(getPrice() + 100);
        }
        if (isNavigationSystem()) {
            setPrice(getPrice() + 1500);
        }
        if (isBluetooth()) {
            setPrice(getPrice() + 200);
        }
        if (isRemoteStart()) {
            setPrice(getPrice() + 400);
        }
        if (isBlindSpotMonitoring()) {
            setPrice(getPrice() + 300);
        }

        return price;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        String toReturn = "owns an " + this.getBrand() + "\n" + "With next features:\n";

        if (!isAutoAirCondition() && !isLeatherSeats() && !isSunRoof() && !isBackupCamera() && !isNavigationSystem() && !isBluetooth() && !isRemoteStart() && !isBlindSpotMonitoring()) {
            toReturn += "\twithout any feature\n";
        } else {

            if (isAutoAirCondition()) {
                toReturn += "\tautomatic air condition\n";
            }
            if (isLeatherSeats()) {
                toReturn += "\tleather seats\n";
            }
            if (isSunRoof()) {
                toReturn += "\tsun roof\n";
            }
            if (isBackupCamera()) {
                toReturn += "\tbackup camera\n";
            }
            if (isNavigationSystem()) {
                toReturn += "\tnavigation system\n";
            }
            if (isBluetooth()) {
                toReturn += "\tbluetooth\n";
            }
            if (isRemoteStart()) {
                toReturn += "\tremote start\n";
            }
            if (isBlindSpotMonitoring()) {
                toReturn += "\tblinding spot monitoring\n";
            }
        }
        toReturn += "Price: " + getTotalPrice() + " euro";

        return toReturn;
    }
}
