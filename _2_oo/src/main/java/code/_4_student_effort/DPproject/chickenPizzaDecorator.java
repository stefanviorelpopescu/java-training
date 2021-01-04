package code._4_student_effort.DPproject;

public class chickenPizzaDecorator extends pizzaDecorator {

    public chickenPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    public String makePizza() {
        return pizza.makePizza() + addChicken();
    }
    public String addChicken() {
        return "Chicken is added";
    }
}
