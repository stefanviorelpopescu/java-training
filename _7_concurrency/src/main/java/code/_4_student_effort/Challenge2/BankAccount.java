package code._4_student_effort.Challenge2;

public class BankAccount {
    private String name;
    private int debit;

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    void withdraw(double amount) {
        longDatabaseCall();

        if (debit < amount) {
            System.out.println("Not enough money");
        } else {
            debit -= amount;
        }
    }

    void deposit(double amount) {
        longDatabaseCall();

        debit += amount;
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getDebit() {
        return debit;
    }

    public String getName() {
        return name;
    }
}
