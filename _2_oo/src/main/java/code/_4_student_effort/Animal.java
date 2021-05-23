package code._4_student_effort;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    protected abstract void eat();
    public void walk(){
        System.out.println("Animal walks with " + legs + " legs");
    }
}
