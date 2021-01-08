package clean.code.design_patterns.requirements;

public class ATMWithdrawChain {
    WithdrawChain firstChain;

    public ATMWithdrawChain() {
        // initialize the chain
        this.firstChain = new Withdraw500();
        WithdrawChain secondChain = new Withdraw200();
        WithdrawChain thirdChain = new Withdraw100();
        WithdrawChain fourthChain = new Withdraw50();
        WithdrawChain fifthChain = new Withdraw10();


        // set the chain of responsibility
        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);
        thirdChain.setNextChain(fourthChain);
        fourthChain.setNextChain(fifthChain);
    }
}
