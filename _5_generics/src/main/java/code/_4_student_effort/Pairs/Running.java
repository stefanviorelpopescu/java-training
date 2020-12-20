package code._4_student_effort.Pairs;

public class Running implements  Shoe {
    private String color;
    private int size;

    public Running(String color, int number) {
        this.color = color;
        this.size = number;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
