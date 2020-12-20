package code._4_student_effort;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {
    // Class<T> - reference at classes of type T
    public <E extends Currency, T extends Currency> T convert(E currencyToConvert, Class<T> destinationCurrency) {
        T toReturn = null;
        try {
            toReturn = destinationCurrency.getDeclaredConstructor().newInstance(currencyToConvert.getAmountOfMoney() * 3);
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new CurrencyException("Eroare la convertire!");
        }
        toReturn.setAmountOfMoney(currencyToConvert.getAmountOfMoney() * 3);
        return toReturn;
    }

    public <E extends Currency, T extends Currency> T convert2(E currencyToConvert, Class<T> destinationCurrency, Double rate) throws CurrencyException {
        T toReturn = null;
        try {
            toReturn = destinationCurrency.getDeclaredConstructor().newInstance(currencyToConvert.getAmountOfMoney() * rate);
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new CurrencyException("Eroare la convertire!");
        }
        toReturn.setAmountOfMoney(currencyToConvert.getAmountOfMoney() * rate);
        return toReturn;
    }
}
