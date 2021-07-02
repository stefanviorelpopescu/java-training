package code._4_student_effort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Drawer {
    private boolean[] openState;
    private int level;
    private Map<Integer, List<String>> documents;

    public Drawer(int level){
        this.level = level;
        openState = new boolean[level];
        documents = new HashMap<>();
    }

    public void openLevel(int inputLevel){
        if(isOpen(inputLevel)){
            System.out.println("Level already open");
        }
        else{
            openState[inputLevel] = true;
        }
    }

    public void closeLevel(int inputLevel){
        if(!isOpen(inputLevel)){
            System.out.println("Level already closed");
        }
        else{
            openState[inputLevel] = false;
        }
    }

    public void addDocumentToLevel(int inputLevel, String document){
        if(isOpen(inputLevel)){
            if(documents.get(inputLevel).size() == 0){
                List<String> levelDocuments = new ArrayList<>();
                levelDocuments.add(document);
                documents.put(inputLevel,levelDocuments);
            }
            else{
                documents.get(inputLevel).add(document);
            }
        }
        else{
            System.out.println("Drawer level closed, open it first");
        }
    }

    public List<String> getDocuments(int inputLevel){
        if(isOpen(inputLevel)){
            return documents.get(inputLevel);
        }
        else{
            System.out.println("Drawer level closed, open it first");
            return null;
        }
    }
    public boolean isOpen(int inputLevel){
        return openState[inputLevel];
    }
}
