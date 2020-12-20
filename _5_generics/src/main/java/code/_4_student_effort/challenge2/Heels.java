package code._4_student_effort.challenge2;

class Heels implements Shoe {
    private final String color;
    private final double size;

    public Heels(String color, double size) {
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