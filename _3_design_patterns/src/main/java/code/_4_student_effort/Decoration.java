package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public abstract class Decoration implements DecorableTree{
    protected int pos;
    protected DecorableTree christmasTree;

    public Decoration(int pos, DecorableTree christmasTree) {
        this.pos = pos;
        this.christmasTree = christmasTree;
    }

    @Override
    public List<List<String>> getTree() {
        List<List<String>> originalTree = christmasTree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(originalTree);
        int left = decoratedTree.get(pos).indexOf("<");
        int right = decoratedTree.get(pos).indexOf(">");

        List<String> originalRow = decoratedTree.get(pos);
        List<String> decoratedRow = new ArrayList<>(originalRow);
        for (int i = left + 1; i < right; i++) {
            decoratedRow.set(i, getDecoration());
        }
        decoratedTree.set(pos, decoratedRow);
        return decoratedTree;
    }

    public abstract String getDecoration();

    @Override
    public void display() {
        List<List<String>> tree = this.getTree();
        for (int i = 0; i < tree.size(); i++) {
            for (int j = 0; j < tree.get(i).size(); j++) {
                System.out.print(tree.get(i).get(j));
            }
            System.out.println();
        }
    }
}
