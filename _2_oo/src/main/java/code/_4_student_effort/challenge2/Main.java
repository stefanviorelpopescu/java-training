package code._4_student_effort.challenge2;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar",1990);
        Premiu oscar2000 = new Premiu("oscar",2000);
        Premiu oscar2010 = new Premiu("oscar",2010);
        Premiu oscar2018 = new Premiu("oscar",2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscar",35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu 1 oscar",55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu 1 oscar",23, new Premiu[]{oscar2018});
        Actor actorFara1 = new Actor("actor fara",33, new Premiu[]{});
        Actor actorFara2 = new Actor("actor fara",60, new Premiu[]{});

        Film film1 = new Film(1990,"film1", new Actor[]{actorOscar1990,actorFara2});
        Film film2 = new Film(2010,"film2", new Actor[]{actorFara2});
        Film film3 = new Film(2010,"film3", new Actor[]{actorFara1,actorFara2});
        Film film4 = new Film(2018,"film4", new Actor[]{actorOscar2018,actorFara2,actorOscar2010});
        Film film5 = new Film(2018,"film5", new Actor[]{actorFara2});

        Studio studio1 = new Studio("MGM",new Film[]{film1,film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3,film4,film5});

        Studio[] studioDatabase = new Studio[]{studio1,studio2};

        //requirement 1
        System.out.println("REQUIREMENT 1:");
        for(Studio loopStudio: studioDatabase){
            if(loopStudio.getFilme().length > 2){
                System.out.println(loopStudio.getNume());
            }
        }

        //requirement 2
        System.out.println("REQUIREMENT 2");
        for(Studio loopStudio: studioDatabase){
            boolean foundInStudio = false;
            for(Film loopFilm: loopStudio.getFilme()){
                for(Actor loopActor: loopFilm.getActori()){
                    if(loopActor.getNume().equals("actor cu 2 oscar")){
                        System.out.println(loopStudio.getNume());
                        foundInStudio = true;
                    }
                    if(foundInStudio)break;
                }
                if(foundInStudio)break;
            }
        }

        //requirement 3
        System.out.println("REQUIREMENT 3");
        for(Studio loopStudio: studioDatabase){
            boolean foundInFilm = false;
            for(Film loopFilm: loopStudio.getFilme()){
                for(Actor loopActor: loopFilm.getActori()){
                    if(loopActor.getVarsta() > 50){
                        System.out.println(loopFilm.getNume());
                        foundInFilm = true;
                    }
                    if(foundInFilm)break;
                }
            }
        }
    }
}
