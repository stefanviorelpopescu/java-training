package code._4_student_effort.decorations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CandyDecorator implements DecorableTreeDecorator {
    DecorableTree decorableTree;

    public CandyDecorator(DecorableTree decorableTree) {
        this.decorableTree = decorableTree;
    }

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

    @Override
    public List<List<String>> getTree() {
        List<List<String>> tree = decorableTree.getTree();
        List<List<String>> decoratedTree = new ArrayList<>(tree);
        List<String> row = tree.get(3);
        List<String> decoratedRow = new ArrayList<>(row);

        int right = row.indexOf("<");
        int left = row.indexOf(">");

        for (int j = right + 1; j < left; j++) {
            decoratedRow.set(j, "C");
        }
        decoratedTree.set(3, decoratedRow);

        return Collections.unmodifiableList(decoratedTree);
    }
}
