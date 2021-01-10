package code._4_student_effort;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private String name;
    private int debit;
    private Lock lock = new ReentrantLock(true);

    public BankAccount(String name, int debit) {
        this.name = name;
        this.debit = debit;
    }

    void withdraw(double amount) {
        longDatabaseCall();
        this.debit -= amount;
    }

    void deposit(double amount) {
        longDatabaseCall();
        this.debit += amount;
    }

    void longDatabaseCall() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean lockBankAccount() {
        lock.lock(); //can result in deadlock
        return true;
    }

    public void unlockBankAccount() {
        lock.unlock();
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}
