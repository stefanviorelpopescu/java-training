package clean.code.design_patterns.requirements.facade_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClientFacade {
    private static int choice;

    public static void main(String[] args) throws IOException {
        System.out.println("Jewelry options:");
        System.out.println("1. Rings");
        System.out.println("2. Bracelets");
        System.out.println("3. Necklaces");
        System.out.println("4. Earrings");

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your choice: ");
        choice = Integer.parseInt(buffer.readLine());

        Shop shop = new Shop();

        switch (choice) {
            case 1:
                shop.ringSale();
                break;
            case 2:
                shop.braceletSale();
                break;
            case 3:
                shop.necklaceSale();
                break;
            case 4:
                shop.earringSale();
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
