package code._4_student_effort;

public class Running implements Shoe {
    private String colour;
    private int size;

    public Running(String colour, int size) {
        this.colour = colour;
        this.size = size;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String getColour() {
        return this.colour;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
