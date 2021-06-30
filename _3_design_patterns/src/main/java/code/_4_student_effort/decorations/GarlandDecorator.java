package code._4_student_effort.decorations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GarlandDecorator implements DecorableTreeDecorator {
    DecorableTree decorableTree;

    public GarlandDecorator(DecorableTree decorableTree) {
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
        List<String> row = tree.get(8);
        List<String> decoratedRow = new ArrayList<>(row);

        int left = row.indexOf("<");
        int right = row.indexOf(">");

        for (int j = left + 1; j < right; j++) {
            decoratedRow.set(j, "G");
        }
        decoratedTree.set(8, decoratedRow);

        return Collections.unmodifiableList(decoratedTree);
    }
}
