package code._4_student_effort;

public class Database {
    public static void moreThan2Movies(Studio[] s)
    {
        for(int i=0;i<s.length;i++)
            if(s[i].filme.length>2)
                System.out.println(s[i].nume);
    }
    public static void moreThan2Reward( Studio[] s)
    {
        for(int i=0;i<s.length;i++)
            for(int j=0;j<s[i].filme.length;j++)
                for(int k=0;k<s[i].filme[j].actori.length;k++)
                 {String actor_nume=s[i].filme[j].actori[k].nume;
                     if (actor_nume.equals("actor cu 2 oscaruri"))
                        System.out.println(actor_nume);
        }
    }
    public static void atLeast50Age( Studio[] s)
    {
        for(int i=0;i<s.length;i++)
            for(int j=0;j<s[i].filme.length;j++)
                for(int k=0;k<s[i].filme[j].actori.length;k++)
                {int actor_varsta=s[i].filme[j].actori[k].varsta;
                    if (actor_varsta>50)
                        System.out.println(s[i].filme[j].nume);
                }
    }
}

