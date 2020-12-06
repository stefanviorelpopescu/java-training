package code._4_student_effort.hardchallenge_1_decorations;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {
        DecorableTree christmasTree = new ChristmasTree();
        DecorableTree decoratedTree = christmasTree;

        decoratedTree = new Candy(3, decoratedTree);
        decoratedTree = new Garland(5, decoratedTree);
        decoratedTree = new Bulbs(6, decoratedTree);
        decoratedTree = new Garland(8, decoratedTree);
        decoratedTree = new Garland(9, decoratedTree);


        System.out.println(ANSI_RED + "---- HardCode Challenge 1 ----" + ANSI_RESET);
        christmasTree.display();
        decoratedTree.display();


    }
}
