package code._4_student_effort.DPproject;

public class specialPizzaDecorator extends pizzaDecorator{


    public specialPizzaDecorator(Pizza pizza) {
        super(pizza);
    }

    public String makePizza() {
        return pizza.makePizza() + addSpecialIngredient();
    }
    public String addSpecialIngredient() {
        return " Special ingrediends are added";
    }
}
