package code._4_student_effort;

public class ExchangeDesk {
    public <T extends Currency, K extends Currency> K convert(T currency, Class<K> toCurrency, double rate) {
        K result = null;
        try{
            result = toCurrency.getDeclaredConstructor(double.class).newInstance(0);
            result.setValue(currency.getValue() * rate);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return result;
    }
}
