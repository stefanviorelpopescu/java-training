package code._4_student_effort.Challenge2;

public class Controller {

   // Studio[] studios;
    //Movie movie;

    public Controller(){

    }

    public String getStudioWithMoreThan2Movies(Studio[] studios){
        String s="";
        for(Studio studio: studios){
            if(studio.getMovies().length>2)
                s+=studio.getName()+" ";
        }
        return s;
    }

    public String getStudioWithTwoOscarsPrizesActor(Studio[] studios){
        String s="";
        String name="Actor with two oscar prizes";
        for(Studio studio : studios){
            studio.getMovies();
            for(Movie m : studio.getMovies()){
                m.getActors();
                for(Actor actor: m.getActors())
                    if(actor.getName().equals(name))
                    s=studio.getName()+" ";
            }
        }
        return s;
    }

    public String getMovieWithActorsAbove50(Movie[] movies){
        String s="";
        for(Movie movie: movies){
            movie.getActors();
            for(Actor actor: movie.getActors()){
                if(actor.getAge()>50)
                    s+=movie.getName()+", ";
            }
        }
        return s;
    }
}
