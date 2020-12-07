package code._4_student_effort;

import java.util.ArrayList;

public class RealEstateAgentProxy implements RealEstateAgent{
    ArrayList<Apartment> apps;
    RealEstateAgentProxy(){
        apps = new ArrayList<>();
    }
    @Override
    public void represent(Apartment apartment){
        apps.add(apartment);
    }
    Apartment rent(StudentCC3 student){
        if(student.name.startsWith("P"))
            return null;
        else {
            for(Apartment a : apps) {
                if(student.money >= a.monthlyRentCost){
                    boolean rem = apps.remove(a);
                    return a;
                }
            }
        }
        return null;
    }
}
