package code._4_student_effort.Challenge1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk {

    public <E extends MoneyType, T extends MoneyType> T convert(E originalType, Class<T> toConvert, double rate) {

        T toReturn = null;

        try {
            toReturn = toConvert.getDeclaredConstructor().newInstance();
            toReturn.setSum(originalType.getSum()*rate);
        } catch (ExchangeDeskConversionException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return toReturn;
    }
}
