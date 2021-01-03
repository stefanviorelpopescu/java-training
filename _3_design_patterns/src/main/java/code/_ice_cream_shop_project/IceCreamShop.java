package code._ice_cream_shop_project;

import java.util.Scanner;

public class IceCreamShop {
    public static void pay (PaymentStrategy strategy, double amount) {
        strategy.makePayment(amount);
    }
    public static void main(String[] args) {
        IceCreamFactory instance = IceCreamFactory.getInstance();
        System.out.println("Hello and welcome!\nToday we have:\n");
        int i = 1;
        for(IceCreamFactory.IceCreamType iceCream : IceCreamFactory.IceCreamType.values()) {
            System.out.println(i + ". " + iceCream + " ice cream with " + instance.choseIceCream(iceCream).getflavor() + " flavor for only " + instance.choseIceCream(iceCream).getPrice() + "$.");
            i++;
        }
        System.out.println("Choose yours:\n");
        Scanner scan = new Scanner(System.in);
        int iceType = scan.nextInt();
        IceCream iceCream = null;
        if (iceType == 1) {
            iceCream = instance.choseIceCream(IceCreamFactory.IceCreamType.valueOf("Chocolate"));
        } else if (iceType == 2) {
            iceCream = instance.choseIceCream(IceCreamFactory.IceCreamType.valueOf("Vanilla"));
        } else {
            iceCream = instance.choseIceCream(IceCreamFactory.IceCreamType.valueOf("Strawberry"));
        }

        System.out.println("You choose " + iceType);
        System.out.println("\nFor payment we accept: \n1.PayPal payment\n2.ApplePay payment.\nChoose yours:\n");

        // Press 1 or 2 then enter
        Scanner scan2 = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
        if (num == 1) {
            pay(new PayPalPayment(), iceCream.getPrice());
        } else {
            pay (new ApplePayPayment(), iceCream.getPrice());
        }

    }
}
