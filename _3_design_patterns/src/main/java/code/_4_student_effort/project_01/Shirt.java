package code._4_student_effort.project_01;

public class Shirt extends Product {

    Shirt(Product.Size size, Product.Colour colour) {
        super(size, colour);
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
