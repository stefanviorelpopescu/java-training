package code._4_student_effort;

public class Boot implements Shoe {
    String colour;
    int size;

    public Boot(String colour, int size) {
        this.colour = colour;
        this.size = size;
    }

    @Override
    public String getColor() {
        return colour;
    }

    @Override
    public double getSize() {
        return size;
    }
}
