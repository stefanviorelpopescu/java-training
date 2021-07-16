package clean.code.design_patterns.requirements.factory;

public class HtmlButton implements Button {

    @Override
    public void display() {
        System.out.println("<button class='btn'>Click Me!</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Button has been clicked!");
    }

    @Override
    public void onHover() {
        System.out.println("This is an html button!");
    }
}
