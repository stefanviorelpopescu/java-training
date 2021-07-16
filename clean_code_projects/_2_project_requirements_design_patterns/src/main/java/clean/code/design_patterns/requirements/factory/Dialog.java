package clean.code.design_patterns.requirements.factory;

public abstract class Dialog {

    public void displayPanel() {
        Button successButton = createButton();
        successButton.display();
    }

    public abstract Button createButton();
}
