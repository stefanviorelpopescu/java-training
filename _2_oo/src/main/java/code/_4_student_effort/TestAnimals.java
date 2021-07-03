package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        // Fish
        System.out.println();
        System.out.println("Fish :");
        d.walk();
        d.eat();
        d.play();
        System.out.println(d.getName());
        d.setName("Cody");
        System.out.println(d.getName());

        // Cat
        System.out.println();
        System.out.println("Cat :");
        System.out.println(c.getName());
        c.setName("Olive");
        System.out.println(c.getName());
        c.play();
        c.eat();

        // Fish
        System.out.println();
        System.out.println("Fish :");
        a.eat();
        a.walk();
        ((Fish) a).play();

        // Spider
        System.out.println();
        System.out.println("Spider :");
        e.eat();
        e.walk();

        // Cat
        System.out.println();
        System.out.println("Cat :");
        System.out.println(p.getName());
        p.play();
        p.setName("Mia");
        System.out.println(p.getName());
    }
}
