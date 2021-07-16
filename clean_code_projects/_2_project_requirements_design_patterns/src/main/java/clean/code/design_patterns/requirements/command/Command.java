package clean.code.design_patterns.requirements.command;

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }
    // save text from the editor's texField
    void backup() {
        backup = editor.textField.getText();
    }
    // set the current text as the previous one
    public void undo() {
        editor.textField.setText(backup);
    }
    // abstract method, that will execute different commands (copy, cut, paste, undo)
    public abstract boolean execute();
}
