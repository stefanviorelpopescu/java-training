package code._4_student_effort._2_challengeTwo;

public class Actor {
    private String name;
    private int age;
    private Prize[] prizes;

    public Actor(String name, int age, Prize[] prizes) {
        this.name = name;
        this.age = age;
        this.prizes = prizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Prize[] getPrizes() {
        return prizes;
    }

    public void setPrizes(Prize[] prizes) {
        this.prizes = prizes;
    }
}
