package code._4_student_effort.challenge3;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    void represent(Apartment apartment) {
        apartments = Arrays.copyOf(apartments, apartments.length + 1);
        apartments[apartments.length - 1] = apartment;
    }

    Apartment rent(Student student){
        if (!student.getName().startsWith("P")) {
            for (Apartment ap : apartments) {
                if (student.getMoney() > ap.getMonthlyRentCost()) {
                    return ap;
                }
            }
        }
        return null;
    }
}
