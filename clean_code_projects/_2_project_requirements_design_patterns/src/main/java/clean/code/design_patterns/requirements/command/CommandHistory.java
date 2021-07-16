package clean.code.design_patterns.requirements.command;

import java.util.Stack;

public class CommandHistory {
    // stack with all executed commands
    private Stack<Command> history = new Stack<>();
    // add new command to history
    public void push(Command c) {
        history.push(c);
    }
    // remove command from history
    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
