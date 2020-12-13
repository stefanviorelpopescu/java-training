package code._4_student_effort._3_challenge;

import java.util.ArrayList;

public class RealEstateAgentProxy {

    ArrayList<Apartment> listOfApartments;

    // ctor without params. to create list of apartments
    public RealEstateAgentProxy() {

        listOfApartments = new ArrayList<>();
    }

    void represent(Apartment apartment) {

        listOfApartments.add(apartment);
    }

    Apartment rent(Student student) {
        for (Apartment apartament : listOfApartments) {
            if (student.money >= apartament.monthlyRentCost &&
             !student.name.startsWith("P") && !apartament.isRented) {
                apartament.isRented = true;
                return apartament;
            }
        }
        return null;
    }
}
