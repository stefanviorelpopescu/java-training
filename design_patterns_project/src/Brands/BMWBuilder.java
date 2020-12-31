package Brands;

public class BMWBuilder extends Builder {

    public BMWBuilder(String ownerName) {
        super(ownerName);
    }

    public BMW build() {
        return new BMW(this);
    }
}