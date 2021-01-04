package code._4_student_effort.DPproject;

public class vegPizzaDecorator extends pizzaDecorator {

    public vegPizzaDecorator(Pizza pizza) {
        super(pizza);
    }
    public String makePizza() {
        return pizza.makePizza() + addVeg();
    }
    public String addVeg() {
        return "Vegetables are added";
    }
}

