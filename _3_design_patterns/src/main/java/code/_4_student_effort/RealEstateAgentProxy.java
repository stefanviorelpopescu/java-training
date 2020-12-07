package code._4_student_effort;

import java.util.ArrayList;

public class RealEstateAgentProxy {
    ArrayList<Apartment> apartments = new ArrayList<>();

    public void represent(Apartment apartment){
        apartments.add(apartment);
    }

    public Apartment rent(Student student){
        int maxRent = student.getMoney();
        int minRent = student.getMoney();
        int index = -1;
        if(student.getName().toUpperCase().toCharArray()[0] != 'P'){
            for(Apartment apartment : apartments){
                if(apartment.getMonthlyRentCost() < minRent && apartment.getMonthlyRentCost() < maxRent){
                    minRent = apartment.getMonthlyRentCost();
                    index = apartments.indexOf(apartment);
                }
            }
        }
        if(index == -1){
            return null;
        }
        Apartment apartmentClone = apartments.get(index);
        apartments.remove(index);
        return apartmentClone;
    }
}
