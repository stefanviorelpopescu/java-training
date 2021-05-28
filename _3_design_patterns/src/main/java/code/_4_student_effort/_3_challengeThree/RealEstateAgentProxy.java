package code._4_student_effort._3_challengeThree;

import java.util.ArrayList;

public class RealEstateAgentProxy {

    private ArrayList<Apartment> apartmentList =  new ArrayList<>();

    public void represent(Apartment apartment) {
        apartmentList.add(apartment);
    }

    public Apartment rent (Student student) {
        Apartment rental = null;
        if (student.getName().startsWith("P")) {
            return null;
        }
        for (Apartment ap : apartmentList) {
            if (ap.getMonthlyRentCost() <= student.getMoney()) {
                rental = ap;
//                apartmentList.remove(ap);
            }
        }
        return rental;
    }
}
