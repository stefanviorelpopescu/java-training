package code._4_student_effort;
import java.util.Random;
public class BoxingMatch {
    private Fighter jedi;
    private Fighter sith;

    public BoxingMatch(Fighter jedi , Fighter sith){
        this.jedi = jedi;
        this.sith = sith;
    }
    public String fight(){
        Random rand = new Random();
        int random_number = rand.nextInt(100);
        while (jedi.getHealth()>= 0 && sith.getHealth()>=0){
            if(random_number % 2 == 0){
                jedi.attack(sith);
                random_number = rand.nextInt(100);
            }else{
                sith.attack(jedi);
                random_number = rand.nextInt(100);
            }
        }
        if(jedi.getHealth()<=0){
            return sith.getName();
        }else{
            return jedi.getName();
        }
    }

    public static void main(String[] args) {
        Fighter jedi = new Fighter("Obi-Wan",100,20);
        Fighter sith = new Fighter("General Grievous",100,20);
        BoxingMatch revengeOfTheSith = new BoxingMatch(jedi,sith);
        String winner = revengeOfTheSith.fight();
        if(winner.equals("Obi-Wan")) {
            System.out.println("The Jedi Order has become more powerful thanks to : "+ winner);
        }else
        {
            System.out.println("The First Order has become more powerful thanks to : " + winner);
        }
    }
}
