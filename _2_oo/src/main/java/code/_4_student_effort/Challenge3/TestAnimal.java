package code._4_student_effort.Challenge3;

public class TestAnimal {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c =  new Cat("Fkuffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.setName("Neo");
        System.out.println(d.getName());
        d.walk();
        d.eat();
        d.play();

        System.out.println(c.getName());
        c.eat();
        c.play();
        c.walk();

        a.eat();
        a.walk();

        e.eat();
        e.walk();

        System.out.println(p.getName());
        p.play();


//        Downcasting
        Animal animal = new Cat("Tom");
        System.out.println(((Cat) animal).getName());
        ((Cat) animal).animalSound();

        ((Fish) a).animalSound();
    }
}
