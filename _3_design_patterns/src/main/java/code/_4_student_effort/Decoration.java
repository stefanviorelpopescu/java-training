package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public abstract class Decoration implements DecorableTree {

    protected int position;
    protected DecorableTree christmasTree;

    public Decoration(int position, DecorableTree christmasTree) {
        this.position = position;
        this.christmasTree = christmasTree;
    }

    @Override
    public List<List<String>> getTree() {
        List<List<String>> originalTree = christmasTree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(originalTree);

        int startPosition = decoratedTree.get(position).indexOf("<");
        int endPosition = decoratedTree.get(position).indexOf(">");

        List<String> originalTreeRow = decoratedTree.get(position);
        List<String> decoratedTreeRow = new ArrayList<>(originalTreeRow);

        for (int i = startPosition + 1; i < endPosition; i++) {
            decoratedTreeRow.set(i, chooseDecoration());
        }
        decoratedTree.set(position, decoratedTreeRow);
        return decoratedTree;
    }

    public abstract String chooseDecoration();

    @Override
    public void display() {
        List<List<String>> tree = this.getTree();
        for (List<String> strings : tree) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
