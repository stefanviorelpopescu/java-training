package code._4_student_effort.bank_transactions;

public class TransactionThread extends Thread {
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, int priority, BankAccount from, BankAccount to, int amount) {
        super(name);
        super.setPriority(priority);
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {
        synchronized (from) {
            from.withdraw(amount);
            synchronized (to) {
                to.deposit(amount);
                System.out.println("Transaction successfully");
            }
        }
    }
}
