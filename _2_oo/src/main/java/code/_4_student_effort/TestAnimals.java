package code._4_student_effort;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.play();
        System.out.println("The fish has: " + d.legs + " legs!");
        c.walk();
        System.out.println("Name: " + c.getName());
        a.eat();
        a.walk();
        e.walk();
        System.out.println("Name: " + p.getName());
        p.setName("Pis");
        System.out.println("Name: " + p.getName());

    }
}
