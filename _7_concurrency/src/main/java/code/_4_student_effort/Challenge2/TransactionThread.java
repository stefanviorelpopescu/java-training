package code._4_student_effort.Challenge2;

public class TransactionThread extends Thread{
    private String name;
    private BankAccount from;
    private BankAccount to;
    private int amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, int amount) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from,to,amount);
    }

    private void transfer(BankAccount from, BankAccount to, int amount) {

        // lock from where we want to transfer
        synchronized (from) {
            // lock to where the money are transfered
            synchronized (to) {
                from.withdraw(amount);
                to.deposit(amount);

                System.out.println(name + " succesfully!");
            }
        }
    }
}
