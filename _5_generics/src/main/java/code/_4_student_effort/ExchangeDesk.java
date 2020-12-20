package code._4_student_effort;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {
    public <E extends Currency, T extends Currency> T convert(E currencyToConvert, Class<T> destinationCurrency, Double rate) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        T toReturn = destinationCurrency.getDeclaredConstructor().newInstance();
        toReturn.setAmountOfMoney(currencyToConvert.getAmountOfMoney() * rate);
        return toReturn;
    }
}
