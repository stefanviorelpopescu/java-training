package code._4_student_effort;

public class Running implements Shoe {
    private String color;
    private float size;

    public Running(String color, float size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public float getSize() {
       return size;
    }
}
