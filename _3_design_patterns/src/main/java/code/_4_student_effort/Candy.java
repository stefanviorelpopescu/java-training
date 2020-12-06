package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Candy implements TreeDecorator {
    private DecorableTree tree;

    private List<List<String>> decoratedTree;

    public Candy(DecorableTree tree) {
        this.tree = tree;
        this.decoratedTree = decorate();
    }

    @Override
    public List<List<String>> decorate() {
        List<List<String>> undecoratedTree = this.tree.getTree();
        List<String> row;

        List<List<String>> decoratedTree = new ArrayList<>();
        List<String> decoratedRow;

        int rowToBeDecorated = 3;

        for (int i = 0; i < undecoratedTree.size(); i++) {
            row = undecoratedTree.get(i);
            decoratedRow = new ArrayList<>();
            for (int j = 0; j < row.size(); j++) {
                if ((i == rowToBeDecorated) && (j >= (row.size()/2 - i)) && (j < (row.size()/2 + i))) {
                    if (row.get(j) == " ") {
                        decoratedRow.add("C");
                    } else {
                        decoratedRow.add(row.get(j));
                        rowToBeDecorated += 3;
                    }
                } else {
                    decoratedRow.add(row.get(j));
                }
            }
            decoratedTree.add(decoratedRow);
        }
        return decoratedTree;
    }

    @Override
    public List<List<String>> getTree() {
        return this.decoratedTree;
    }

    @Override
    public void display() {
        for (int i = 0; i < decoratedTree.size(); i++) {
            for (int j = 0; j < decoratedTree.get(i).size(); j++) {
                System.out.print(decoratedTree.get(i).get(j));
            }
            System.out.println();
        }
    }
}
