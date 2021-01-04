package code._4_student_effort.DPproject;

public abstract class pizzaDecorator implements Pizza {
    Pizza pizza;

    public pizzaDecorator(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    public String makePizza() {

        return pizza.makePizza();
    }
}
