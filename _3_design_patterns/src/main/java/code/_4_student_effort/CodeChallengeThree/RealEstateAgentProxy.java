package code._4_student_effort.CodeChallengeThree;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    private ArrayList<Apartment> apartments=new ArrayList<>();
    public void represent(Apartment apartment){
        apartments.add(apartment);
    }


        public Apartment rent(Student student){
        Apartment rented=null;
        if(!student.getName().startsWith("P"))
            for(Apartment ap:apartments)
                if(ap.getRentPerMonth()<student.getMoney()) {
                    rented = ap;
                    apartments.remove(ap);
                    return rented;
                }
        return rented;
        }

}
