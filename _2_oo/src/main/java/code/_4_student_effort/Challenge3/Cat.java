package code._4_student_effort.Challenge3;

public class Cat extends Animal{

    private String name;

    public Cat(int legs,String name){
        super(legs);
        this.name=name;
    }

/*    public Cat(){
        Cat.this;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(){
        System.out.println("Cat is playing");
    }

    public void eat(){
        System.out.println("Cat is eating");
    }
}
