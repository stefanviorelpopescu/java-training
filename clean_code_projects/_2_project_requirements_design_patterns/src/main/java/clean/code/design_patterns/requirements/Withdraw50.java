package clean.code.design_patterns.requirements;

public class Withdraw50 implements WithdrawChain {
    private WithdrawChain chain;

    @Override
    public void setNextChain(WithdrawChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void withdraw(BankAccount account, int amount) {
        if (amount >= 50) {
            int numberOfBills = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing " + numberOfBills + " bills of 50 lei.");
            account.balance = account.balance - (numberOfBills * 50);
            this.chain.withdraw(account, remainder);
        }
        else {
            this.chain.withdraw(account, amount);
        }
    }
}
