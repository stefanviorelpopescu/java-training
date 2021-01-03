package code._4_student_effort.project;

public class DiscountApply {
    private DiscountStrategy discountStrategy;

    public void changeStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    public double applyDiscount(Item item){
        if(item.getPrice() < 50){
            changeStrategy(new MiniDiscount());
        } else if(item.getPrice() > 50 && item.getPrice() < 100){
            changeStrategy(new MediumDiscount());
        } else {
            changeStrategy(new MaximumDiscount());
        }
        return discountStrategy.applyDiscount(item);
    }
}
