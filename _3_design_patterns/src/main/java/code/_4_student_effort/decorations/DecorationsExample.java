package code._4_student_effort.decorations;

public class DecorationsExample {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();
        christmasTree.display();

        DecorableTree decoratedTree = new GarlandDecorator(new BulbDecorator(new CandyDecorator(christmasTree)));
        decoratedTree.display();
    }
}

