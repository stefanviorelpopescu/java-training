package code._4_student_effort;

public class Animal {
    protected int legs;
    protected Animal(int legs)
    {
        this.legs=legs;
    }
    public void  walk(){
        System.out.print("Walk ");
    }
    public void eat(){
        System.out.print("Eat ");
    }
}
