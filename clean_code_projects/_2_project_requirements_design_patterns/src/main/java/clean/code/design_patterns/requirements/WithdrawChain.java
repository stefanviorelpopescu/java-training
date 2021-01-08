package clean.code.design_patterns.requirements;

public interface WithdrawChain {
    void setNextChain(WithdrawChain nextChain);
    void withdraw(BankAccount account, int amount);
}
