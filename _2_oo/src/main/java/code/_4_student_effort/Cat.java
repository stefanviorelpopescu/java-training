package code._4_student_effort;

public class Cat extends Animal implements Pet{
    String nume;

    public Cat(String nume){
        super(4);
        this.nume=nume;
    }

    public Cat() {
        this(" ");
    }

    public void eat(){
        System.out.println(nume+" ate a mouse");
    }
    public String getName(){
        return nume;
    }
    public void setName(String s){
        nume=s;
    }
    public void play(){
        System.out.println(nume+" is playing");
    }
}
