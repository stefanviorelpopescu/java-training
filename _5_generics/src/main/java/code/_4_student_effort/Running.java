package code._4_student_effort;

public class Running implements Shoe {
    String colour;
    int size;

    public Running(String colour,int size) {
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
