package code._4_student_effort.hardChallenge1;

import java.util.ArrayList;
import java.util.List;

public class Candy implements DecorableTree {
    protected int row = 3;
    protected DecorableTree christmasTree;

    public Candy(DecorableTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public List<List<String>> getTree() {
        List<List<String>> originalTree = christmasTree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(originalTree);
        int left = decoratedTree.get(row).indexOf("<");
        int right = decoratedTree.get(row).indexOf(">");

        List<String> originalTreeRow = decoratedTree.get(row);
        List<String> decoratedTreeRow = new ArrayList<>(originalTreeRow);
        for (int i = left + 1; i < right; i++) {
            decoratedTreeRow.set(i, "C");
        }
        decoratedTree.set(row, decoratedTreeRow);
        return decoratedTree;
    }


    @Override
    public void display() {
        List<List<String>> tree = this.getTree();
        for (List<String> strings : tree) {
            for (int j = 0; j < strings.size(); j++) {
                System.out.print(strings.get(j));
            }
            System.out.println();
        }
    }
}