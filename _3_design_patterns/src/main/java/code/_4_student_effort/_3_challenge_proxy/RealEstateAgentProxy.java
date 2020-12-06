package code._4_student_effort._3_challenge_proxy;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    ArrayList<Apartment> apartmentList;

    public RealEstateAgentProxy() {
       apartmentList = new ArrayList<>();
    }

    void represent(Apartment apartment){
        apartmentList.add(apartment);
    }

    Apartment rent(Student student){
        for (Apartment apartment : apartmentList){
            if (student.money >= apartment.monthlyRentCost && !student.name.startsWith("P") && !apartment.isRented) {
                apartment.isRented = true;
                return apartment;
            }
        }
        return null;
    }

}
