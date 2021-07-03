package code._4_student_effort;

public class Cat extends Animal implements Pet{
    private String name;
    protected Cat(String name){
        super(4);
        this.name = name;
    }
    protected Cat(){
        this.name="";
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
        System.out.println("A small ball was thrown for " + this.name);
    }
    @Override
    public void eat(){
        System.out.println(this.name + " is eating the salmon that I gave her.");
    }
}
