package code._4_student_effort;

public class Cat extends  Animal implements Pet{
    String name;
    Cat(String name){
        super(4);
        this.name = name;
    }
    Cat(){
        this("");
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println("Cat plays with ball");
    }
    void eat(){
        System.out.println("Cat eats mice");
    }
}
