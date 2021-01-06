package clean.code.design_patterns.requirements;

public class EditorState {
    //memento
    private final String content;

    public String getContent() {
        return content;
    }

    public EditorState(String content) {
        this.content = content;
    }
}
