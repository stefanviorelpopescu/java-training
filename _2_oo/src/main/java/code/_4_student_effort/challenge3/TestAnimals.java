package code._4_student_effort.challenge3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat cat = new Cat("Tom");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        e.eat();

        ((Pet) cat).play();

        p.play();

        a.walk();

        e.walk();
    }
}
