package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgent implements EstateAgent {

    List<Apartment> apartmentsRepresented = new ArrayList<>();


    @Override
    public void represent(Apartment apartment) {
        apartmentsRepresented.add(apartment);
    }

    @Override
    public Apartment rent(Student student) {
        Apartment rentedApartment = null;

        for(Apartment apartment : apartmentsRepresented){
            if (student.getRentMoney() >= apartment.getMonthlyRentCost() ) {
                rentedApartment = apartment;
                apartmentsRepresented.remove(apartment);
            }
        }

        return rentedApartment;
    }
}
