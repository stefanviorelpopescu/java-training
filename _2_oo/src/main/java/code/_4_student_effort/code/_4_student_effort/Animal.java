package code._4_student_effort;

abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    abstract void eat();
    void walk (){
        System.out.println("This animal walks in " + legs + " legs");
    }
}
