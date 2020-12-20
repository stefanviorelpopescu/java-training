package code._4_student_effort;

public class Heels implements Shoe {
    String colour;
    int size;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setSize(int size) {
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
