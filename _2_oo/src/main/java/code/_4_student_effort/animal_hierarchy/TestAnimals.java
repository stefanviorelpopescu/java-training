package code._4_student_effort.animal_hierarchy;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();;
        Pet p = new Cat();

        d.eat();
        d.play();
        System.out.println(d.getName());
        d.setName("Dory");
        System.out.println(d.getName());
        d.walk();

        c.eat();
        c.play();
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        p.play();

        ((Spider)e).walk();
    }
}
