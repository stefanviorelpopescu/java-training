package code._4_student_effort.Challange3;

public class Test {
    public static void main(String[] args)
    {
        Fish d= new Fish();
        Cat c = new Cat("FLuffy");
        Animal a= new Fish();
        Animal e = new Spider();
        Pet p= new Cat();

        d.setName("Pestisorul auriu");
        d.eat();

        c.play();

        a.eat();

        e.walk();

        p.setName("FLuffy2");
        p.play();
    }
}
