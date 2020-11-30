package code._4_student_effort.animalHierarchy;

public class Spider extends Animal {

    public Spider(int legs) {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider eat method");
    }

}
