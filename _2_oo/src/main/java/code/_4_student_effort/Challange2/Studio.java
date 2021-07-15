package code._4_student_effort.Challange2;

public class Studio {
    public String nume;
    public Film[] filme;

    public Studio(String nume, Film[] filme)
    {
        this.nume = nume;
        this.filme = filme;
    }

    public String getName()
    {
        if(filme.length >2)
        {
            System.out.println(this.nume);
        }
        return "" ;
    }

    public void getStudioName()
    {
        for(Film film : filme)
        {
            for(Actor actor : film.actori)
            {
                if(actor.nume.equals("actor2"))
                {
                    System.out.println(this.nume);
                }
            }
        }
    }

    public void getMovieName()
    {
        for(Film film : filme)
        {
            for(Actor actor : film.actori)
            {
                if(actor.varsta > 50 )
                {
                    System.out.println(film.nume);
                    break;
                }
            }
        }
    }

}
