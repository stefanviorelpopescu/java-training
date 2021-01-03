package code._ice_cream_shop_project;

public class PayPalPayment implements PaymentStrategy{

    @Override
    public void makePayment(double amount) {
        System.out.println("You chose PayPal. Thank you!");
    }
}
