package code._4_student_effort.challenge1;

public class ExchangeDeskMain {
    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON ronValue = new RON(1000);

        USD newValue = exchangeDesk.convert(ronValue, USD.class, (float) 4.2);
        System.out.println("Exchange result = " + newValue.getValue());

        // stage 2 unfinished
    }
}