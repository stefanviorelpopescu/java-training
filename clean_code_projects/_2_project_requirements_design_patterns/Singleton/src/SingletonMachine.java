

        import java.util.ArrayList;
        import java.util.Scanner;
        import java.util.concurrent.atomic.AtomicReference;

public class SingletonMachine {

    private static SingletonMachine INSTANCE;
    private int credit = 0;
    private ArrayList<Product> listofproducts = new ArrayList<>();

    private SingletonMachine() {

    }

    private SingletonMachine(int credit) {
        this.credit = credit;

    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public void displayProducts() {
        for (Product produs : listofproducts) {
            System.out.println(produs);
        }
    }

    public void insertCoin(int coin) {
        this.credit = this.credit + coin;

    }

    public SingletonMachine addProduct(Product produs) {
        this.listofproducts.add(produs);
        return this;

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

    public static SingletonMachine getInstance(String value) {
        if (INSTANCE == null) {
            synchronized (SingletonMachine.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonMachine();
                }
            }
        }
        return INSTANCE;
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

    public static void main(String[] args) {

        SingletonMachine machine = new SingletonMachine(0);
        Product produs1 = new Product(3, "ciocolata");
        Product produs2 = new Product(4, "suc");
        Product produs3 = new Product(12, "covrigei");
        Product produs4 = new Product(10, "fursecuri");
        machine.addProduct(produs1);
        machine.addProduct(produs2);
        machine.addProduct(produs3);
        machine.addProduct(produs4);

        machine.userMenu();
        Scanner scanner = new Scanner(System.in);



        boolean quit = false;
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Available products:");
                    machine.displayProducts();
                    System.out.println();
                    System.out.println("Choose the next option:");

                    break;
                case 1:
                    System.out.println("Enter coin");
                    int pret = scanner.nextInt();
                    scanner.nextLine();
                    machine.insertCoin(pret);
                    System.out.println();
                    System.out.println("choose the next option");
                    break;
                case 2:
                    System.out.println("Enter the id of the product you are looking for");
                    int readedID = scanner.nextInt();
                    System.out.println("produsul cu id "+readedID+ " este :");
                    System.out.println(machine.selectProduct(readedID));
                    scanner.nextLine();
                    System.out.println();
                    System.out.println("Choose the next option:");
                    break;
                case 3:
                    machine.displayCredit();
                    System.out.println();
                    System.out.println("Choose the next option:");
                    break;
                case 4:
                    machine.userMenu();
                    break;
                case 5:
                    quit = true;
                    break;

            }
        }
    }

}