package code._ice_cream_shop_project;

public class ApplePayPayment implements PaymentStrategy {
    @Override
    public void makePayment(double amount) {
        System.out.println("You chose ApplePay. Thank you!");
    }
}
