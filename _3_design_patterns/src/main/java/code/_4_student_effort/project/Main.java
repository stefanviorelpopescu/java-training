package code._4_student_effort.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        String name;
        double budget;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello, pentru a va ajuta cu comanda avem nevoie de nume si numar de telefon!");
        System.out.println("Introduceti numele!" );
        name = reader.readLine();
        System.out.println("Introduceti bugetul!" );
        budget = Double.parseDouble(reader.readLine());
        System.out.println("Asteapt comanda!");

        Client cl = new Client(name,budget);
        Store store = Store.getInstance();
        DiscountApply discountApply = new DiscountApply();

        while (true){
            Command com = new Command(reader.readLine());
            switch (com.getName()){
                case "exit":
                    return;
                case "list":
                    System.out.println(store);
                    break;
                case "buy":
                    int id = Integer.parseInt(com.getParams().get(0));
                    for (Item item: store.getItems()) {
                        if(item.getId() == id){
                            double priceAfterDiscount = discountApply.applyDiscount(item);
                            if(cl.getBudget() > priceAfterDiscount){

                                cl.setBudget(cl.getBudget() - priceAfterDiscount);
                                System.out.println(("Produsul a fost adaugat in cos!"));
                                System.out.println("Total" + " " + cl.getBudget());
                            }else {
                                System.out.println("Nu aveti suficienti bani!");
                            }
                        }
                    }
                    break;
                default:
                    System.out.println("Nu exista aceasta comanda");
                    break;
            }
        }
    }
}

