package code._4_student_effort.Challenge2;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // two bank accounts
        BankAccount mother = new BankAccount("Mother", 99_500);
        BankAccount Vlad = new BankAccount("Vlad", 1_500);

        // bank accounts before transaction
        System.out.println("Before transaction");
        System.out.println(mother.getName() + " amount: " + mother.getDebit());
        System.out.println(Vlad.getName() + " amount: " + Vlad.getDebit() + "\n");

        // create a new thread and start it
        TransactionThread transfer01 = new TransactionThread("Transfer01", mother, Vlad, 500);
        transfer01.start();

        // wait while transfer01 is still working
        transfer01.join();

        // bank accounts after transaction
        System.out.println("\nAfter transaction");
        System.out.println(mother.getName() + " amount: " + mother.getDebit());
        System.out.println(Vlad.getName() + " amount: " + Vlad.getDebit());
    }
}
