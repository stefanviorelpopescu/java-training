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
        this.transfer(from, to, amount);
    }

    private boolean transfer(BankAccount from, BankAccount to, int amount) {
        boolean success = false;
        if (from.lock()) {
            from.withdraw(amount);
            if(to.lock()){
                to.deposit(amount);
                to.unlock();
                success=true;
            }
            if(!success) from.deposit(amount);
            from.unlock();
        }
        return success;
    }
}
