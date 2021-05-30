package code._4_student_effort.Hardcore_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class TreeDecorator implements DecorativeTree{
    private DecorativeTree tree;
    private int rowInTree;

    public TreeDecorator(DecorativeTree tree,int rowInTree){
        this.tree=tree;
        this.rowInTree=rowInTree;
    }

    public abstract String typeOfDecoration();

    @Override
    public List<List<String>> getTree(){
        List<List<String>> decoratedTree = new ArrayList<>(tree.getTree());
        int leftLimit = decoratedTree.get(rowInTree).indexOf("<");
        int rightLimit = decoratedTree.get(rowInTree).indexOf(">");

        List<String> treeRow = decoratedTree.get(rowInTree);
        List<String> decoratedTreeRow = new ArrayList<>(treeRow);
        for(int i = leftLimit+1; i < rightLimit ;i++){
            decoratedTreeRow.set(i,typeOfDecoration());
        }
        decoratedTree.set(rowInTree,decoratedTreeRow);
        return decoratedTree;
    }

    @Override
    public void display(){
        List<List<String>> tree = this.getTree();
        for (int i = 0;i<tree.size();i++){
            for(int j = 0;j< tree.get(i).size();j++){
                System.out.print(tree.get(i).get(j));
            }
            System.out.println();
        }
    }

}
