package code._4_student_effort.bank_transactions;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        BankAccount account1 = new BankAccount("Corina", 5234);
        BankAccount account2 = new BankAccount("Catalin", 123);


        System.out.println("Status 1:");
        System.out.println(account1);
        System.out.println(account2);

        TransactionThread transactionThread = new TransactionThread("Transaction Groceries", 4, account1, account2,231);
        TransactionThread transactionThread1 = new TransactionThread("Transaction Car", 4, account1,account2, 130);
        TransactionThread transactionThread2 = new TransactionThread("Transaction Car", 3, account2,account1, 13);


        List<TransactionThread>  transactionThreadArrayList = new ArrayList<>();
        transactionThreadArrayList.add(transactionThread);
        transactionThreadArrayList.add(transactionThread1);
        transactionThreadArrayList.add(transactionThread2);

        for (TransactionThread transaction : transactionThreadArrayList) {
            transaction.start();
        }
        for (TransactionThread transaction : transactionThreadArrayList) {
            transaction.join();
        }


        System.out.println("Status 2:");
        System.out.println(account1);
        System.out.println(account2);
    }
}
