package code._4_student_effort.Chllange3;

import code._2_challenge._3_proxy.Apartment;

import java.util.Arrays;

public class RealEstateAgentProxy {

    private Apartament[] appartments = new Apartament[0];

    public void represent(Apartament appartment)
    {
        this.appartments = Arrays.copyOf(this.appartments, this.appartments.length + 1);
        this.appartments[this.appartments.length-1] = appartment;

    }

    public Apartament rent(Student student)
    {
        Apartament rentedAppartment = null;
        if (!student.getName().startsWith("P"))
        {
            for (int i = 0; i < appartments.length; i++)
            {
                if (this.appartments[i].getMonthlyRentCost() < student.getMoney()) {
                    rentedAppartment = this.appartments[i];

                    int removedIndex = i;
                    System.arraycopy(this.appartments, removedIndex + 1, this.appartments, removedIndex, this.appartments.length - 1 - removedIndex);
                }
            }
        }
        return rentedAppartment;
    }
}
