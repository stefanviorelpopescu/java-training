package clean.code.design_patterns.requirements;

public class Withdraw500 implements WithdrawChain {
    private WithdrawChain chain;

    @Override
    public void setNextChain(WithdrawChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void withdraw(BankAccount account, int amount) {
        if (amount >= 500) {
            int numberOfBills = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dispensing " + numberOfBills + " bills of 500 lei.");
            account.balance = account.balance - (numberOfBills * 500);
            this.chain.withdraw(account, remainder);
        }
        else {
            this.chain.withdraw(account, amount);
        }

    }
}
