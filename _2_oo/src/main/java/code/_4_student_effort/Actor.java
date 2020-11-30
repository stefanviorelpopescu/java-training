package code._4_student_effort;

public class Actor {
    private String name;
    private Integer age;
    private Premiu[] awards;

    public Actor(){}

    public Actor(String name, Integer age, Premiu[] awards) {
        this.name = name;
        this.age = age;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Premiu[] getAwards() {
        return awards;
    }

}