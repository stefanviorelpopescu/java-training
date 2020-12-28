package code._4_student_effort.project_01;

public class Tshirt extends Product {

    Tshirt(Product.Size size, Product.Colour colour) {
        super(size, colour);
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
