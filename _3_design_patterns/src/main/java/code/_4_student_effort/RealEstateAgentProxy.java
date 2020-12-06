package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class RealEstateAgentProxy {
    List<Apartament> apartamente = new ArrayList<>();

    void represents(Apartament a){
          apartamente.add(a);
    }

    Apartament rented(StudentProxy stud){
        if(stud.getName().startsWith("p")||stud.getName().startsWith("P")){
            return null;
        }
        else{
            Apartament valid=null;
           for(Apartament ap : apartamente){
               if(ap.getChirie()<=stud.getMoney()){
                   valid=ap;
                   apartamente.remove(ap);
                   break;
               }
           }
           return valid;
        }

    }
}
