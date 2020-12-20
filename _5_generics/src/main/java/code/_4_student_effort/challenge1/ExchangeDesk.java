package code._4_student_effort.challenge1;


public class ExchangeDesk {
    ArrayList<T extends Currency> rates = new ArrayList<T>();

    public <A extends Currency, B extends Currency> B convert(A from, Class<B> to, float rate) {
        B toReturn = null;
        try {
            toReturn = to.getDeclaredConstructor().newInstance();
            toReturn.setValue(from.getValue() * rate);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return toReturn;
    }

    public <A extends Currency, B extends Currency> B addRate(Class<A> from, Class<B> to, float rate) {

    }
}
