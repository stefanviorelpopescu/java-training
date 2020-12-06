package code._4_student_effort.hardchallenge_1_decorations;

import java.util.ArrayList;
import java.util.List;

public abstract class Decorations implements DecorableTree {
    protected int positionInTree;
    protected DecorableTree tree;

    public Decorations(int positionInTree, DecorableTree tree) {
        this.positionInTree = positionInTree;
        this.tree = tree;
    }

    abstract String getDecorations();


    @Override
    public List<List<String>> getTree() {
        List<List<String>> originalTree = tree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(originalTree);

        int leftIndex = decoratedTree.get(positionInTree).indexOf("<");
        int rightIndex = decoratedTree.get(positionInTree).indexOf(">");

        List<String> originalTreeRow = tree.getTree().get(positionInTree);
        List<String> decoratedTreeRow = new ArrayList<>(originalTreeRow);

        for (int currentIndex = leftIndex + 1; currentIndex < rightIndex; currentIndex++){
            decoratedTreeRow.set(currentIndex, getDecorations());
        }
        decoratedTree.set(positionInTree, decoratedTreeRow);

        return decoratedTree;
    }

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