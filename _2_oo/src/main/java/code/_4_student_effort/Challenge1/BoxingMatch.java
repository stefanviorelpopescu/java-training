package code._4_student_effort.Challenge1;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(){
        this.fighter1 =new Fighter("Wayne",1000,100);
        this.fighter2 =new Fighter("Steve",1300,90);
    }

    public String fight(){
        String s="";
        int i=1;
        while(fighter1.getHealth()>=0 && fighter2.getHealth()>=0){
            System.out.println("Round "+i+"  FIGHT!");
            fighter1.attack(fighter2);
            System.out.println("Steve health is: "+ fighter2.getHealth());
            if(fighter2.getHealth()<=0 && fighter1.getHealth()>0)
                s+= fighter1.getName();
            fighter2.attack(fighter1);
            System.out.println("Wayne health is: "+ fighter1.getHealth());
            if(fighter1.getHealth()<=0 && fighter2.getHealth()>0)
                s+= fighter2.getName();

            i++;
        }
        return s;
    }
}
