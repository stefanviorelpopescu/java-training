package exercises.Challenge3;

public class Spider extends Animal {
  public Spider() {
    super(8);
  }

  @Override
  public void eat() {
    System.out.println("the spider eats");
  }
}