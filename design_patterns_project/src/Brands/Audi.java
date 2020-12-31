package Brands;

import Car.Car;

public class Audi extends Car {

    public Audi(Builder builder) {
        super(builder);

        setBrand("Audi");
        setPrice(10500);        // starting price for an Audi
    }
}
