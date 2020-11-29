package code._4_student_effort;

public class Fish extends Animal implements  Pet{
    String name;
    Fish(){
        super(0);
    }
    @Override
    void eat(){
        //super.eat();      <- nu putem apela metoda eat folosind super deoarece superclasa naostra(Animal) este declarata ca fiind abstracta
        System.out.println("Fish eats worms");
    }
    @Override
    void walk(){
        System.out.println("Fish can't walk");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish plays with mermaid");
    }
}
