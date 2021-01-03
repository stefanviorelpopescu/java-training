package code._4_student_effort.project;

public class MaximumDiscount implements  DiscountStrategy {
    @Override
    public double applyDiscount(Item item) {
       System.out.println("Discount-ul de 15% a fost aplicat!");
        return 0.85 * item.getPrice();
    }
}