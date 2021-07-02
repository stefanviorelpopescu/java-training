package code._4_student_effort.challange_3;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy implements RealEstateAgent{

    private List<Apartment> apartmentList;

    public RealEstateAgentProxy() {
        apartmentList = new ArrayList<>();
    }

    public void respresent(Apartment ap){
        apartmentList.add(ap);
    }

    @Override
    public Apartment rent(Student student) {
        if(student.getName().trim().startsWith("P")){
            return null;
        }
        else {
            //search for lowest price
            Apartment lowest = apartmentList.get(0);
            for(Apartment ap : apartmentList){
                if(ap.getMonthyRentCost() < lowest.getMonthyRentCost()){
                    lowest = ap;
                }
            }
            if(student.getMoney() > lowest.getMonthyRentCost()){
                apartmentList.remove(lowest);
                return lowest;
            }
            return null;
        }
    }
}
