package code._4_student_effort;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

/*    public Cat(){
        this.Cat("");
    }*/

    @Override
    void eat() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName() {
    }

    @Override
    public void play() {
    }
}
