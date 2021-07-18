package code._4_student_effort.challenge_3;

public class TestAnimals {
    public static void main() {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.setName("Nemo");
        System.out.println(d.getName());
        d.eat();
        d.play();
        d.walk();

        System.out.println(c.getName());
        c.setName("Pufi");
        System.out.println(c.getName());
        c.eat();
        c.play();
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.setName("Meow");
        p.getName();
        p.play();
    }
}
