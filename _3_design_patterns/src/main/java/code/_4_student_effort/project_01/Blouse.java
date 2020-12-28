package code._4_student_effort.project_01;

public class Blouse extends Product {

    Blouse(Product.Size size, Product.Colour colour) {
        super(size, colour);
    }

    @Override
    public double getPrice() {
        return 80;
    }

}
