package code._4_student_effort.proxy;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
   private List<Apartment> apartments;

   public RealEstateAgentProxy(){
       this.apartments=new ArrayList<>();
   }

    public void represent(Apartment apartment){
        this.apartments.add(apartment);

    }

    public Apartment rent(Student student){
       if(student.getName().charAt(0)=='P' || student.getName().charAt(0)== 'p'){
           return  null;
       }
       for (int i=0;i<apartments.size();i++){
           if(apartments.get(i).getMonthlyRentCost() <= student.getMoney()){
               Apartment a = apartments.get(i);
               apartments.remove(i);
               return a;
           }
       }
       return null;
    }
}
