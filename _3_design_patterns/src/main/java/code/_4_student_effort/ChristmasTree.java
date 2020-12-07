package code._4_student_effort;

import code._2_challenge.hard._1_decorations.DecorableTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ChristmasTree implements DecorableTree {
    private List<List<String>> tree;
    private int size;
    public ChristmasTree(){
        this.size = 10;
        this.tree = getTree();
    }
    @Override
    public List<List<String>> getTree() {
        List<List<String>> tree = new ArrayList<>();
        List<String> row;
        for(int i = 0; i < size; i++){
            row = new ArrayList<>();
            for(int j = 0; j < size * 2; j++){
                if(j == (size - i)) row.add("<");
                if(j == (size + i)) row.add(">");
                row.add(" ");
            }
            tree.add(Collections.unmodifiableList(row));
        }
        for(int i = 0; i < 3; i++){
            row = new ArrayList<>();
            for(int j = 0; j < size * 2; j++){
                if(j == size - 2) row.add("|");
                if(j == size + 2) row.add("|");
                row.add(" ");
            }
            tree.add(Collections.unmodifiableList(row));
        }
        return Collections.unmodifiableList(tree);
    }

    @Override
    public void display() {
        for(int i = 0; i < tree.size(); i++){
            for(int j = 0; j < tree.get(i).size(); j++){
                System.out.print(tree.get(i).get(j));
            }
        }
    }
}
