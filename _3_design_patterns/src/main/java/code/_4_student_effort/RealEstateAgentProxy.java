package code._4_student_effort;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    void represent(Apartment apartment){
        this.apartments = Arrays.copyOf(this.apartments, this.apartments.length + 1);
        this.apartments[this.apartments.length-1] = apartment;
    }

    Apartment rent(Student student) {
        Apartment res = null;
        if (student.getName().startsWith("P")) {
            return null;
        }
        for (int i = 0; i < apartments.length; i++) {
            if (student.getMoney() > this.apartments[i].getMonthlyRentCost() ) {
                res = apartments[i];
                System.arraycopy(this.apartments, i + 1, this.apartments, i, this.apartments.length - 1 - i);

            }
        }
        return res;
    }
}
