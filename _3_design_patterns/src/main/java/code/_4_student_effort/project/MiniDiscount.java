package code._4_student_effort.project;

public class MiniDiscount implements DiscountStrategy{

    @Override
    public double applyDiscount (Item item){
        System.out.println("Discount-ul de 10% a fost aplicat!");
        return 0.9*item.getPrice();
    }
}
