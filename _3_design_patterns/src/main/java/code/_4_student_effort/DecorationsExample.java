package code._4_student_effort;

public class DecorationsExample {
    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();
        DecorableTree decoratedTree = christmasTree;
        decoratedTree = new Candy(3, decoratedTree);
        decoratedTree = new Bulb(6, decoratedTree);
        decoratedTree = new Garland(8, decoratedTree);

        christmasTree.display();
        decoratedTree.display();
    }
}
