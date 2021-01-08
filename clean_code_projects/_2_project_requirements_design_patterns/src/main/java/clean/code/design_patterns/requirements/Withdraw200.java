package clean.code.design_patterns.requirements;

public class Withdraw200 implements WithdrawChain {
    private WithdrawChain chain;

    @Override
    public void setNextChain(WithdrawChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void withdraw(BankAccount account, int amount) {
        if (amount >= 200) {
            int numberOfBills = amount / 200;
            int remainder = amount % 200;
            System.out.println("Dispensing " + numberOfBills + " bills of 200 lei.");
            account.balance = account.balance - (numberOfBills * 200);
            this.chain.withdraw(account, remainder);
        }
        else {
            this.chain.withdraw(account, amount);
        }
    }
}
