package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
    List<Apartment> list_apart=new ArrayList<Apartment>();
    void represent(Apartment apartment)
    {
        list_apart.add(apartment);
    }
    Apartment rent(Student student)
    {
        Apartment rented_ap = null;
        if(Character.compare(student.name.charAt(0),'P')==0)
            return null;
        else
        {
            for (int i = 0; i < list_apart.size(); i++)//iterate the list of apartments represented by RealEstateAgent
            {
                int price=list_apart.get(i).money;//obtain the apartment price
                if(price<student.getMoney())
                    rented_ap=list_apart.get(i);
            }
        }
        return rented_ap;
    }
}
