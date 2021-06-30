package main.java.code._4_student_effort.animal_hierarchy;

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
        System.out.println(d.getName());
        d.setName("Dory");
        System.out.println(d.getName());

        c.walk();
        c.play();
        c.eat();
        System.out.println(c.getName());
        c.setName("Kitty");
        System.out.println(c.getName());

        a.walk();
        a.eat();
        ((Fish) a).play();

        e.walk();
        e.eat();

        p.play();
        ((Cat) p).walk();
        ((Cat) p).eat();
    }
}
