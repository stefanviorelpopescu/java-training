package code._4_student_effort.proxy;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    public void represent(Apartment apartment) {
        apartments = Arrays.copyOf(apartments, apartments.length + 1);
        apartments[apartments.length - 1] = apartment;
    }

    public Apartment rent(Student student) {
        Apartment apartment = null;
        boolean ok = true;
        if (student.getName().startsWith("P")) {
            ok = false;
        }

        if (ok) {
            for (int i = 0; i < apartments.length; i++) {
                if (apartments[i].getMonthlyRentCost() < student.getMoney()) {
                    apartment = apartments[i];

                    System.arraycopy(apartments, i + 1, apartments, i, apartments.length - 1);
                }
            }
        }

        return apartment;
    }
}
