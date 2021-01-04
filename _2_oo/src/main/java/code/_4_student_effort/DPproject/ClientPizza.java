package code._4_student_effort.DPproject;

public class ClientPizza {
    public static void main(String[] args) {
        plainPizza p = new plainPizza();
        String plainpizza = p.makePizza();
        System.out.println(plainpizza);

//        Preparing veg pizza
        String vegPizza = new vegPizzaDecorator(p).makePizza();
        System.out.println(vegPizza);

//        Preparing chicken pizza
        String chickenPizza = new chickenPizzaDecorator(p).makePizza();
        System.out.println(chickenPizza);

//        Preparing special pizza
        String specialPizza = new specialPizzaDecorator(p).makePizza();
        System.out.println(specialPizza);

    }
}
