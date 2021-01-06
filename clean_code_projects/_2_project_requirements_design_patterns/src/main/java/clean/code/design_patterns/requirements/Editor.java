package clean.code.design_patterns.requirements;

public class Editor {
    //originator
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public EditorState save() {
        return new EditorState(content);
    }
    public void restore(EditorState state ){
        content = state.getContent();
    }
}
