package code._4_student_effort;

import java.util.Arrays;

public class RealEstateAgentProxy {
    private Apartment[] list = new Apartment[0];
    public void represent(Apartment apartment){
        this.list = Arrays.copyOf(this.list,this.list.length+1);
        this.list[list.length-1] = apartment;
    }
    public Apartment rent(Student student){
        Apartment rentedApartment = null;
        if(!student.getName().startsWith("P")){
            for(int i = 0;i<list.length;i++){
                if(this.list[i].getMonthlyRentCost() < student.getMoney()){
                    rentedApartment = this.list[i];
                    System.arraycopy(this.list,i+1,this.list,i,this.list.length-i-1);
                }
            }
        }else
        {
            return null;
        }
        return rentedApartment;
    }
}
