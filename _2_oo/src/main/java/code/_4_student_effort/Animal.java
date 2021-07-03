package code._4_student_effort;

public abstract class Animal {
    protected Integer legs;
    protected Animal(Integer legs){
        this.legs=legs;
    }
    protected Animal(){

    }
    public abstract void eat();
    public void walk(){
        System.out.println("An animal with "+ this.legs + "is walking right now.");
    }

}
