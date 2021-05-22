package code._4_student_effort.challenge_2;

public class Actor {
    private String name;
    private Integer age;
    private Reward[] rewards;

    public Actor(String name, Integer age, Reward[] rewards) {
        this.name = name;
        this.age = age;
        this.rewards = rewards;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Reward[] getRewards() {
        return rewards;
    }
}
