package code._4_student_effort._2_challengeTwo;

public class Heels implements Shoe {
    private String color;
    private float size;

    public Heels(String color, float size) {
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
