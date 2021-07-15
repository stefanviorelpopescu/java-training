package code._4_student_effort.Challange1Bun;

public class BoxingMatch {
    private Fighter jucator1;
    private Fighter jucator2;

    public BoxingMatch(Fighter jucator1, Fighter jucator2)
    {
        this.jucator1 = jucator1;
        this.jucator2 = jucator2;
    }

    public String fight()
    {
        String castigator="";
        while(jucator1.health > 0 && jucator2.health > 0)
        {
            jucator1.attack(jucator2);
            jucator2.attack(jucator1);
        }

        if(jucator1.health <= 0)
        {
            castigator = jucator2.name;
        }

        if(jucator2.health <= 0)
        {
            castigator = jucator1.name;
        }
        return castigator;
    }

    public static void main(String[] args)
    {
        Fighter jucator1= new Fighter("Jucator1", 85, 5);
        Fighter jucator2= new Fighter("Jucator2",100,10);
        BoxingMatch b= new BoxingMatch(jucator1,jucator2);
        String castigator = b.fight();
        System.out.println("Jucatorul castigator este:" + castigator);




    }
}
