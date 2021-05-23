package code._4_student_effort.Challange3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs)
    {
        this.legs= legs;
    }

    public abstract void eat();

    public void walk()
    {
        System.out.println("Animalul merge cu " + this.legs + " piciaore");
    }


}

