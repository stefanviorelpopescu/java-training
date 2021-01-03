package code._4_student_effort.challenge1;

public class ExchangeDesk {
    <T extends Currency, F extends Currency> T convert(F from, Class<T> toClass, double rate) {
        T result = null;
        try {
            result = toClass.getDeclaredConstructor().newInstance();
            result.setValue(from.getValue() * rate);
        } catch (Exception ex) {
            System.out.println("Error");
        }

        return result;
    }
}
