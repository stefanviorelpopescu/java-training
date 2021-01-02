package code._4_student_effort._1_exchange_desk;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        System.out.println(ANSI_RED + "---- Code Challenge 1 ----" + ANSI_RESET);

        ExchangeDesk exchangeDesk = new ExchangeDesk();

        RON lei = new RON(1000d);
        USD usd = exchangeDesk.convert(lei, USD.class, 3.98d);
        System.out.println(usd.getMoney());

        exchangeDesk.addRate(RON.class, USD.class , 3.98d);
    }
}
