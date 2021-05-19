package code._4_student_effort._3_challengeThree;

public class TestAnimals {

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("Fish has: " + d.legs + " legs.");
        d.setName("Piper");
        System.out.println("He is called: " + d.getName() + ".");
        d.eat();
        d.play();
        d.walk();

        System.out.println();

        System.out.println("Cat has: " + c.legs + " legs.");
        System.out.println("Cat's name is: " + c.getName() + ".");
        c.setName("Rozi");
        System.out.println("Cat's new name is: " + c.getName() + ".");
        c.eat();
        c.play();
        c.walk();
        c.eat("a rat");

        System.out.println();

        System.out.println("Fish has: " + a.legs + " legs.");
        ((Fish) a).setName("Baloo");
        System.out.println("He is called: " + ((Fish) a).getName() + ".");
        a.eat();
        ((Fish) a).play();
        a.walk();

        System.out.println();

        System.out.println("Spider has: " + e.legs + " legs.");
        e.eat();
        e.walk();

        System.out.println();

        System.out.println("Cat has: " + ((Cat) p).legs + " legs.");
        p.setName("Margherita");
        System.out.println("Cat's name is: " + p.getName() + ".");
        ((Cat) p).eat();
        p.play();
        ((Cat) p).walk();
        ((Cat) p).eat("Whiskas");

        System.out.println();

        e.eat();
        ((Cat) p).eat();
        a.eat();

        System.out.println();

        ((Spider) e).eat(12, "bugs");
    }
}
