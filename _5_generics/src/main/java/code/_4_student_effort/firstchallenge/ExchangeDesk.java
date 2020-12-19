package code._4_student_effort.firstchallenge;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {

    public <E extends Currency, T extends Currency> T convert(E currencyToConvert, Class<T> destinationCurrency, Double rate) throws CurrencyException {

        T toReturn = null;
        try {
            toReturn = destinationCurrency.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            throw new CurrencyException("Eroare la convertire");
        }
        toReturn.setAmountOfMoney(currencyToConvert.getAmountOfMoney() * rate);
         return toReturn;
    }
}

