package clean.code.design_patterns.requirements;

public class BankAccount {
    private final String accountNumber;
    private final String owner;
    private final String accountType;
    private final String bank;
    Double balance;

    public BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.accountType = builder.accountType;
        this.bank = builder.bank;
        this.balance = builder.balance;
    }

    public void deposit(Double balance) {
        Double originalBalance = this.balance;
        this.balance = this.balance + balance;
        System.out.println("<<Account balance increased by " + balance.intValue() + " lei>>  <<Original balance: " + originalBalance.intValue() + " lei>> <<Balance after deposit: " + this.balance.intValue() + " lei>>");
    }

    public String checkBalance() {
        return "<<Account balance: " + balance.intValue() + " lei>>";
    }

    public static void transfer(BankAccount accountDepositing, BankAccount accountToReceiveDeposit, Double amount) {
        Double originalBalance = accountToReceiveDeposit.balance;
        accountDepositing.balance = accountDepositing.balance - amount;
        accountToReceiveDeposit.balance = accountToReceiveDeposit.balance + amount;
        System.out.println("Transaction details: " );
        System.out.println("<<Account balance increased by " + amount.intValue() + " lei, received from " + accountDepositing.accountNumber + ">> <<Original balance: " + originalBalance.intValue() + ">>" + " <<Balance after deposit: " + accountToReceiveDeposit.balance.intValue() + " lei>>");

    }


    public static class Builder {
        private final String accountNumber;
        private String owner;
        private String accountType;
        private String bank;
        private double balance;

        public Builder(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public Builder withAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder atBank(String bank) {
            this.bank = bank;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }


        public BankAccount build() {
            return new BankAccount(this);
        }


    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", accountType='" + accountType + '\'' +
                ", bank='" + bank + '\'' +
                ", balance=" + balance +
                '}';
    }
}