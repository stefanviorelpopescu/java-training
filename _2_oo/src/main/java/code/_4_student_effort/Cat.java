package code._4_student_effort;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        super(4);
    }

    @Override
    public void eat() {
        System.out.println("The cat eats mice");
    }

    @Override
    public String getName() {
        return "This cat is called " + this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The cat is purring");
    }
}
