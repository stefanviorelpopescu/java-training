package code._4_student_effort.animalHierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs=legs;
    }

    public void walk(){
        System.out.println("Has "+this.legs +" legs");
    }

    public abstract void eat();


}
