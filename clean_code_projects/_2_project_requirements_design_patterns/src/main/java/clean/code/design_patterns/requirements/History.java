package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

public class History {
    //caretaker
    private List<EditorState> states = new ArrayList<>();

    public void addMemento(EditorState state) {
        states.add(state);
    }
    public EditorState getMemento(){
        EditorState lastState = states.get(states.size()-1);

        states.remove(lastState);
        return lastState;
    }
}
