package clean.code.design_patterns.requirements;

public class Withdraw100 implements WithdrawChain {
    private WithdrawChain chain;

    @Override
    public void setNextChain(WithdrawChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void withdraw(BankAccount account, int amount) {
        if (amount >= 100) {
            int numberOfBills = amount / 100;
            int remainder = amount % 100;
            System.out.println("Dispensing " + numberOfBills + " bills of 100 lei.");
            account.balance = account.balance - (numberOfBills * 100);
            this.chain.withdraw(account, remainder);
        }
        else {
            this.chain.withdraw(account, amount);
        }
    }
}
