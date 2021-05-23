package code._4_student_effort.animal;

public class TestAnimal {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.walk();
        c.eat();
        a.walk();
        e.walk();
    }
}
