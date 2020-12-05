package code._4_student_effort;

import static code._4_student_effort.Database.*;

public class Main {

    public static void codeChallenge1() {
        Fighter f1 = new Fighter("Doroftei", 100, 30);
        Fighter f2 = new Fighter("Rocky", 100, 30);
        BoxingMatch match = new BoxingMatch(f1, f2);
        System.out.println("CodeChallenge1: ");
        System.out.println(match.fight());
    }


    public static void main(String[] args) {
        codeChallenge1();
        System.out.println("CodeChallenge2: ");
        codeChallenge2();
        System.out.println("CodeChallenge3: ");
        codeChallenge3();


    }
    public static void codeChallenge3() {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        //Experiment by calling the methods in each object
        d.setName("Fishes");
        d.eat();
        d.play();
        d.walk();
        System.out.println(d.getName());

        c.eat();
        c.play();
        c.walk();
        System.out.println(c.getName());

        a.walk();
        a.eat();

        e.walk();
        e.eat();

        p.play();
        p.setName("Pet");
        System.out.println(p.getName());

        //Experiment by casting objects

        Animal animal = c;
        animal.eat();
        animal.walk();

        Pet pet = c;
        pet.setName("New Fluffy");
        pet.play();
        System.out.println(pet.getName());


    }

}


