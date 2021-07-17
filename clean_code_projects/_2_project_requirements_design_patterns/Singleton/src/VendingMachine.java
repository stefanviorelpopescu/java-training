import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {

    private int credit = 0;
    private ArrayList<Product> listofproducts;
    private int nrofListed = 0;

    public VendingMachine(int credit) {
        this.credit = credit;
        listofproducts = new ArrayList<Product>();
    }

    public int getCredit() {

        return this.credit;
    }

    public void displayProducts() {
        for (Product produs : listofproducts) {
            System.out.println(produs);
            nrofListed++;
        }
    }

    public boolean productsListed() {
        return nrofListed == this.listofproducts.size();

    }

    public void insertCoin(int coin) {
        this.credit = this.credit + coin;

    }

    public String selectProduct(int id) {

        for (Product produs : listofproducts) {
            if (produs.getId() == id) {
                return produs.toString();
            }
        }
        return "error, this product does not exist";

    }

    public void displayCredit() {

        System.out.println("The current credit is " + this.credit);
    }

    public void addProduct(Product produs) {
        this.listofproducts.add(produs);

    }

    public void userMenu() {
        System.out.println("Available options: ");
        System.out.println("0 -Display available Products ");
        System.out.println("1 -insert Coin ");
        System.out.println("2 -Select Product ");
        System.out.println("3 -Display Credit ");
        System.out.println("4-Print menu");
        System.out.println("5-Quit");

    }



}