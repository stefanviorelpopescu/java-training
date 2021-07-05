package code._4_student_effort._1_challengeOne;

public class ExchangeDesk {

    <A extends Currency, B extends Currency> A convert (B fromCurrency, Class<A> currencyToClass, double exchangeRate) {
        A toCurrency = null;
        try {
            toCurrency = currencyToClass.getDeclaredConstructor().newInstance();
            toCurrency.setSum(fromCurrency.getSum() * exchangeRate);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return toCurrency;
    }

    <A extends Currency, B extends Currency> void addRate(Class<A> firstCurrency, Class<B> secondCurrency, double rate) throws IllegalAccessException {
        if (rate == 0) {
            throw new IllegalAccessException("Rate cannot be zero!");
        }

        A.getRates().put(secondCurrency, rate);
        B.getRates().put(firstCurrency, 1/rate);
    }
}
