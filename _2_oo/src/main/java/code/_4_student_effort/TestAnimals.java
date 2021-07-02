package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        d.play();
        d.eat();
        d.setName("Blub");
        System.out.println(d.getName());

        c.walk();
        c.play();
        c.eat();

        a.walk();
        a.eat();

        e.walk();
        e.eat();

        p.play();
    }
}
