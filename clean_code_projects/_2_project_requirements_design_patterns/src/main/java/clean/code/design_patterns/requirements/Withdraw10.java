package clean.code.design_patterns.requirements;

public class Withdraw10 implements WithdrawChain {

    @Override
    public void setNextChain(WithdrawChain nextChain) {
    }

    @Override
    public void withdraw(BankAccount account, int amount) {
        if (amount >= 10) {
            int numberOfBills = amount / 10;

            System.out.println("Dispensing " + numberOfBills + " bills of 10 lei.");
            account.balance = account.balance - (numberOfBills * 10);
        }
    }
}
