package code._4_student_effort.Hardcore_1;

public class Main {
    public static void main(String[] args) {
        DecorativeTree christmasTree = new ChristmasTree();
        DecorativeTree decorativeTree = christmasTree;
        decorativeTree = new Garland(decorativeTree,8);
        decorativeTree = new Bulbs(decorativeTree,6);
        decorativeTree = new Candy(decorativeTree,3);

        christmasTree.display();
        decorativeTree.display();
    }
}
