package code._4_student_effort;

public class Cat extends Animal implements Pet {
    String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        this("");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The cat is playing");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }
}
