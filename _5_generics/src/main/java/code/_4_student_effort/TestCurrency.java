package code._4_student_effort;

import java.lang.reflect.InvocationTargetException;

public class TestCurrency {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        //challenge1
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        Ron lei = new Ron();
        lei.setAmountOfMoney(1000d);
        Dollar dollar = exchangeDesk.convert(lei, Dollar.class, 4.1d);
        System.out.println(dollar.getAmountOfMoney());
    }
}
