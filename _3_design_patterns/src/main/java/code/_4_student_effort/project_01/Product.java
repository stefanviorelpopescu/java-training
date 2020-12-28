package code._4_student_effort.project_01;

public abstract class Product {
    public enum Type {
        Tshirt, Shirt, Blouse
    }

    public enum Size {
        S, M, L
    }

    public enum Colour {
        Black, White, Grey
    }

    private Colour colour;
    private Size size;

    // Default values
    public Product() {
        this.size = Size.S;
        this.colour = Colour.Black;
    }

    public Product(Size size, Colour colour) {
        this.size = size;
        this.colour = colour;
    }

    public abstract double getPrice();

    public Colour getColour() {
        return this.colour;
    }

    public Size getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "Product{ " +
                "colour = " + colour +
                ", size = " + size +
                ", price = " + getPrice() +
                " }";
    }
}
