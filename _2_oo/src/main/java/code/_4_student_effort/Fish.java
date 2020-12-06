package code._4_student_effort;

public class Fish extends Animal implements Pet{
    String nume;

    public Fish() {
        super(0);

    }


    @Override
    public void walk() {
        System.out.println("fish cannot walk");
    }
    public void eat(){
        System.out.println("the fish is eating");
    }
    public String getName(){
        return nume;
    }
    public void setName(String nume){
        this.nume=nume;
    }

    public void play() {
    System.out.println("the fish is playing");
    }
}
