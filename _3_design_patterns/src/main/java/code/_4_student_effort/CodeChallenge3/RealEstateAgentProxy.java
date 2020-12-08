package code._4_student_effort.CodeChallenge3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {

    private List<Apartment> apartmentList;

    public RealEstateAgentProxy() {

        this.apartmentList = new ArrayList<>();
    }

    public void represent(Apartment apartment) {

        this.apartmentList.add(apartment);
    }

    public Apartment rent(Student student) {

        if (!student.getName().startsWith("P")) {

            Apartment possibleRent = new Apartment("", 999999);

            for (Apartment apartment : this.apartmentList) {

                if (apartment.getMonthlyRentCost() <= student.getMoney() && !apartment.isRented() &&
                        apartment.getMonthlyRentCost() < possibleRent.getMonthlyRentCost()) {

                    possibleRent = apartment;
                }
            }

            if (possibleRent.getMonthlyRentCost() != 999999) {

                possibleRent.setRented(true);
                return possibleRent;
            }

        }
        return null;
    }
}
