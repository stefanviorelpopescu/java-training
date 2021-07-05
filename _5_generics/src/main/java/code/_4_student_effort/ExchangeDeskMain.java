package code._4_student_effort;

import code._2_challenge._1_exchange_desk.Ron;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDeskMain {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        RON lei = new RON();
        lei.setSum(1000d);

        exchangeDesk.addRate(RON.class, USD.class, 2.0d);

        USD dollar = exchangeDesk.convert(lei, USD.class);
        System.out.println(dollar.getSum() == -1 ? "Unsupported conversion" : dollar.getSum());

        exchangeDesk.addRate(RON.class, USD.class, 4.0d);

        USD dollar2 = exchangeDesk.convert(lei, USD.class);
        System.out.println(dollar2.getSum());
    }

}
