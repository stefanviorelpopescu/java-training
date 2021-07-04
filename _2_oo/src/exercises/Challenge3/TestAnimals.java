package exercises.Challenge3;

public class TestAnimals {
  public static void main(String[] args) {
    Fish fish = new Fish();
    Cat cat = new Cat("Fluffy");
    Animal animal = new Fish();
    Animal animal1 = new Spider();
    Pet pet = new Cat();
    fish.eat();
    cat.eat();
    animal.eat();
    animal1.eat();
    pet.play();
  }
}
