package code._4_student_effort;

import java.util.Arrays;

public class RealEstateAgentProxy{
    private Apartment[] appartments = new Apartment[0];


    void represent(Apartment appartment) {
        this.appartments = Arrays.copyOf(this.appartments, this.appartments.length + 1);
        this.appartments[this.appartments.length-1] = appartment;
    }


   public Apartment rent(Student student) {
        Apartment rentedAppartment = null;
        if ( !student.name.startsWith("P")) {
            for(int i=0; i<appartments.length; i++){
                if(student.money > this.appartments[i].monthlyRentCost) {
                    rentedAppartment=this.appartments[i];
                    System.arraycopy(this.appartments,i+1,this.appartments,i, this.appartments.length-1-i);}
            }
        }

        return rentedAppartment;
    }



}

