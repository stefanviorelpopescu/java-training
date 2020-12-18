package code._4_student_effort.Challenge2;

public class Boot implements Shoe {
    private String color;
    private int size;

    public Boot(String color, int size) {
        this.color = color;
        this.size = size;
    }


    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getSize() {
        return size;
    }
}
