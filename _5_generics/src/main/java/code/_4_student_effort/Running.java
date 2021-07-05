package code._4_student_effort;

public class Running implements Shoe {
    private String color;
    private Integer size;

    public Running(String color, Integer size) {
        this.color = color;
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getSize() {
        return this.size;
    }
}
