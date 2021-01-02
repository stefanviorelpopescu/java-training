package code._4_student_effort._1_exchange_desk;

import java.lang.reflect.InvocationTargetException;
import java.util.*;


public class ExchangeDesk {
    public LinkedHashMap<Map.Entry<Class<? extends Currency>, Class<? extends Currency>>, Double> CurrencyLog = new LinkedHashMap<>();


    public <D extends Currency, T extends Currency> void addRate(Class<D> firstCurrency, Class<T> secondCurrency, double rate) {
        Map.Entry<Class<? extends Currency>, Class<? extends Currency>> pair = new AbstractMap.SimpleEntry<>(firstCurrency, secondCurrency);


        if (!CurrencyLog.containsKey(pair)) {
            CurrencyLog.put(pair, rate);
        }


    }

    public <D extends Currency, T extends Currency> T convert(D baseCurrency, Class<T> convertedCurrency, double rate) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        T conversionResult;

        conversionResult = convertedCurrency.getDeclaredConstructor().newInstance();
        conversionResult.setMoney(baseCurrency.getMoney() * rate);

//        if (CurrencyLog.containsValue()) {
//            conversionResult = convertedCurrency.getDeclaredConstructor().newInstance();
//            conversionResult.setMoney(baseCurrency.getMoney() * rate);
//
//        }


        return conversionResult;
    }

}