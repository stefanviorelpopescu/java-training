package code._4_student_effort.challenge1;

public class Currency {
    private String name;
    private float value;

    public Currency() {
    }

    protected Currency(float value, String name) {
        this.value = value;
        this.name = name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public float getValue() {
        return value;
    }
}
