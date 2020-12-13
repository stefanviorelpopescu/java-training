package code._4_student_effort.CodeChallenge3;

import java.util.Arrays;

public class RealEstateAgentProxy {
    Apartament[] apartaments=new Apartament[0];

    public void represent(Apartament apartament){
        this.apartaments= Arrays.copyOf(this.apartaments,this.apartaments.length+1);
        this.apartaments[this.apartaments.length-1]=apartament;

    }
   public Apartament rent(Student student){
        Apartament app=null;
        if(student.getName().trim().startsWith("P")){
            return null;
        }else {
           for(int i=0;i<this.apartaments.length;i++){
               if(apartaments[i].monthlyCost<student.getMoney()){
                   app=this.apartaments[i];
                   System.arraycopy(apartaments,i+1,apartaments,i,apartaments.length-1-i);
               }
           }
        }
        return app;
    }
}
