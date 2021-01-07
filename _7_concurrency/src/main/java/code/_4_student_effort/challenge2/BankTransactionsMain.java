package code._4_student_effort.challenge2;

public class BankTransactionsMain {
    public static void main(String[] args) throws Exception {
        BankAccount Ana = new BankAccount("ana", 250);
        BankAccount Maria = new BankAccount("maria", 150);

        TransactionThread tt1 = new TransactionThread("TT1", Maria, Ana, 50);

        tt1.start();

        tt1.join();

        System.out.println(Ana);
        System.out.println(Maria);
    }
}
