package code._4_student_effort.Challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RealEstateAgentProxy {
    private Apartment[] apartments = new Apartment[0];

    public void represent(Apartment apartment) {
        int n = this.apartments.length;
        this.apartments = Arrays.copyOf(this.apartments, n + 1);
        this.apartments[n] = apartment;
    }

    public Apartment rent(Student student) {
        Apartment apartmentRentedByStudent = null;

        if (!student.nameStartsWithP()) {
            int n = this.apartments.length;
            for (int i=0; i < n; i++) {
                if (this.apartments[i].getMonthlyRentCost() < student.getMoney()) {
                    apartmentRentedByStudent = this.apartments[i];
                    System.arraycopy(this.apartments, i + 1, this.apartments, i, n - 1 - i);
                }
            }
        }

        return apartmentRentedByStudent;
    }

}
