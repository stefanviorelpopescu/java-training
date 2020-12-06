package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class RealEstateProxy {
    private final List<Apartament> apartments = new ArrayList<>();

    void represent(Apartament apartment) {
        this.apartments.add(apartment);
    }

   Apartament rent(Student student) {

        if (!student.name.startsWith("P")) {
            for (Apartament apartment : apartments) {
                if (apartment.monthlyRentCost < student.money) {
                    int removedIndex = apartments.indexOf(apartment);
                    return apartments.remove(removedIndex);
                }
            }
        }
    return null;}
}
