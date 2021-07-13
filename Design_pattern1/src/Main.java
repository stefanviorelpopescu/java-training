import java.util.Scanner;

public class Main {
    // Chain of responsibility
    private static Scanner scanner= new Scanner(System.in);
    private static MobilePhone mobilephone=new MobilePhone("000 396 3467");

    public static void main(String[] args) {
        int choice;
        boolean quit = false;
        String s1, s2;
        while(!quit) {
            System.out.println("Make a choice:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 1:
                    PrintList();
                    break;
                case 2:
                    System.out.println("Add name and number");
                    addNumber();
                    break;
                case 3:
                    System.out.println("name to remove");
                    removeContact();
                    break;
                case 4:
                    quit=true;
                    break;
            }
        }
    }
    private static void PrintList(){
        mobilephone.PrintList();
    }
    private static  void addNumber(){
        System.out.println("enter name");
        String  s1=scanner.nextLine();
        System.out.println("enter number");
        String s2=scanner.nextLine();
        Contacts contact = new Contacts(s1,s2);
        if(mobilephone.addNumber(contact))
            System.out.println("contact added");
        else
            System.out.println("contact not added");
    }

    private static  void removeContact(){
        String s1=scanner.nextLine();
        mobilephone.removeContact(s1);
    }
}
