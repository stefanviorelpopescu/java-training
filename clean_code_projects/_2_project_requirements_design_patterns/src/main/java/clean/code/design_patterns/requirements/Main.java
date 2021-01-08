package clean.code.design_patterns.requirements;


public class Main {

    // Declarations for text color, for better visualization of the code commands
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {
        // Initialising the accounts
        BankAccount firstAccount = new BankAccount.Builder("ROBT1000D44XXX")
                .atBank("BT")
                .withOwner("Michael")
                .withAccountType("Savings")
                .openingBalance(1_000)
                .build();


        BankAccount secondAccount = new BankAccount.Builder("ROBCR1092T477")
                .atBank("BCR")
                .withOwner("V")
                .withAccountType("Illegal activities")
                .openingBalance(52_740)
                .build();

        BankAccount thirdAccount = new BankAccount.Builder("ROBCR156XX49C")
                .atBank("BCR")
                .withOwner("Janice")
                .withAccountType("Student")
                .openingBalance(600)
                .build();

        BankAccount fourthAccount = new BankAccount.Builder("ROBRD7499XCA5")
                .atBank("BRD")
                .withOwner("Alfred")
                .withAccountType("Business")
                .openingBalance(13_400)
                .build();

        BankAccount fifthAccount = new BankAccount.Builder("ROBT9412B0SS19")
                .atBank("BT")
                .withOwner("Batman")
                .withAccountType("Personal")
                .openingBalance(123_450)
                .build();

        // Every method available in BankAccount

        System.out.println(ANSI_RED + "---- The initial accounts ----" + ANSI_RESET);
        System.out.println(firstAccount);
        System.out.println(secondAccount);
        System.out.println(thirdAccount);
        System.out.println(fourthAccount);
        System.out.println(fifthAccount);

        System.out.println(ANSI_RED + "\n---- Deposit method ----" + ANSI_RESET);
        fourthAccount.deposit(1350d);
        fifthAccount.deposit(120050d);

        System.out.println(ANSI_RED + "\n---- Transfer method ----" + ANSI_RESET);
        BankAccount.transfer(firstAccount, secondAccount, 370d);
        BankAccount.transfer(fifthAccount, fourthAccount, 40000d);

        System.out.println(ANSI_RED + "\n---- Check balance method ----" + ANSI_RESET);
        System.out.println(fifthAccount.checkBalance());
        System.out.println(fourthAccount.checkBalance());

        // Withdrawing money from an ATM using chain of responsibility design pattern, only multiples of 10
        System.out.println(ANSI_RED + "\n---- Withdraw method ----" + ANSI_RESET);
        ATMWithdrawChain ATM = new ATMWithdrawChain();
        ATM.firstChain.withdraw(fifthAccount, 1970);
    }
}
