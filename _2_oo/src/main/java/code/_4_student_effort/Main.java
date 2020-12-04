package code._4_student_effort;

public class Main {

  public static void codeChallenge1(){
    Fighter f1= new Fighter("Doroftei", 100,25);
    Fighter f2= new Fighter("Roky", 100,25);
    BoxingMatch match = new BoxingMatch(f1,f2);

    System.out.println(match.fight());
  }
  public static void codeChallenge2() {
    Database database=new Database();
    System.out.println("All Studio names that have published more than 2 movies");
    database.query1();
    System.out.println("The studio names in witch plays the actor with name : actori cu 2 oscaruri ");
    database.query2();
    System.out.println("Movie names in witch plays at least an actor with age above 50");
    database.query3();

  }
  public static void codeChallenge3() {

    Fish d = new Fish();
    Cat c = new Cat("Tom");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();
    d.eat();
    d.getName();
    d.setName("Nemo");
    d.walk();
    c.eat();
    c.getName();
    c.play();
    c.setName("Rumbu");
    c.walk();
    a.eat();
    a.walk();
    p.getName();
    p.play();
    p.setName("Pet");
  }
  public static void main(String[] args) {
    codeChallenge1();
    codeChallenge2();
    codeChallenge3();
  }
}
