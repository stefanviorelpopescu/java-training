package Brands;

import Car.Car;

public class BMW extends Car {

    public BMW(Builder builder) {
        super(builder);

        setBrand("BMW");
        setPrice(9750);         // starting price for an BMW
    }
}
