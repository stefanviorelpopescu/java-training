package code._4_student_effort.project;

public class MediumDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount (Item item){
        System.out.println("Discount-ul de 13% a fost aplicat!");
        return 0.87*item.getPrice();
    }
}
