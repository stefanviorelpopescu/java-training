package third_challenge;

public abstract class Animal {

    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("This animal walk with: " + legs + " legs.");
    }
}
