package code._4_student_effort;

public class TransactionThread extends Thread {
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
        //super.run();
        this.transfer(from, to, amount);
    }

    private boolean transfer(BankAccount from, BankAccount to, int amount) {
        boolean success = false;

        if (from.lockBankAccount()) {
            from.withdraw(amount); //because we pause work here, other threads have a chance to get lock on the other obj

            if (to.lockBankAccount()) {
                to.deposit(amount); //because we pause work here, other threads have a chance to get lock on the other obj
                to.unlockBankAccount();
                success = true;
            }

            if (!success) from.deposit(amount); //in the case deposit was not successful, then we put the money back
            from.unlockBankAccount();
        }

        return success;
    }
}
