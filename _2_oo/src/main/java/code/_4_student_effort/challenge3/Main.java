package code._4_student_effort.challenge3;

public class Main {
  public static void main(String[] args) {
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    d.setName("Nemo");
    c.eat();
    a.eat();
    e.walk();
    System.out.println(d.getName());
    System.out.println(c.getName());
  }
}
