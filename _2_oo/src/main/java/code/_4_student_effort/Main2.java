package code._4_student_effort;

import java.sql.SQLOutput;

public class Main2 {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c=new Cat("Fluffy");
        Animal a= new Fish();
        Animal e=new Spider();
        Pet p= new Cat();
        System.out.println("My name is "+d.getName());
        d.eat();
        d.play();
        d.walk();
        System.out.println("My name is "+ c.getName());
        c.eat();
        c.play();
        c.walk();
        System.out.println("Hey, I'm a fish and I don't have legs");
        a.eat();
        a.walk();
        System.out.println("Hey, I'm a spider and I have 8 legs");
        e.eat();
        e.walk();
        System.out.println("Hey, I'm a cat");
        p.getName();
        p.play();

        Pet newfish=new Fish();
        Animal p_cat=new Cat("ParentCat");//upcasting
        Cat c_cat= (Cat) p_cat;//downcasting
        System.out.println("Hey, I'm newfish");
        newfish.play();
        System.out.println("Hey, I'm "+((Cat) p_cat).getName());
        p_cat.walk();
        ((Cat) p_cat).play();
        System.out.println("Hey, I'm ChildCat");
        c_cat.play();
        c_cat.walk();
    }
}
