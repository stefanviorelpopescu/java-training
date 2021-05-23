package code._4_student_effort;

public class Fish extends Animal implements Pet{
    private String name;
    protected Fish(){
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void play(){
        System.out.println("Place a ball in the aquarium");
    }
    @Override
    public void walk(){
        System.out.println("Fishes can not walk because they do not have legs!");
    }
    @Override
    public void eat() {
        System.out.println("The fish is eating his worms now.");
    }
}
