package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String name;
    private Integer age;
    private List<Premiu> awards;

    public Actor(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.awards = new ArrayList<>();
    }

    public List<Premiu> getAwards() {
        return awards;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
