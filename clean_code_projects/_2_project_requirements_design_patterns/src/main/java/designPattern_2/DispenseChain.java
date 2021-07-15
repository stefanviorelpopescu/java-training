package designPattern_2;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    boolean dispense(Currency cur);
}
