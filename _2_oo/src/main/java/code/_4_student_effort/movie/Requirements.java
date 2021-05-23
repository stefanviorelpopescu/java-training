package code._4_student_effort.movie;

public class Requirements {

    public Studio[] Data() {
        Premiu oscar1990 = new Premiu("oscar", 1996);
        Premiu oscar2000 = new Premiu("oscar", 2666);
        Premiu oscar2010 = new Premiu("oscar", 2616);
        Premiu oscar2018 = new Premiu("oscar", 2618);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new
                Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new
                Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new
                Premiu[]{oscar2018});

        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new
                Premiu[]{});
        Actor actorFaraPremiiO2 = new Actor("actor fara oscar 02", 69, new
                Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new
                Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new
                Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2018, "film cu actori fare premii2", new
                Actor[]{actorFaraPremii01, actorFaraPremiiO2, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fare premii3", new
                Actor[]{actorFaraPremii01, actorFaraPremiiO2, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new
                Actor[]{actorOscar2010, actorOscar2018, actorFaraPremiiO2});
        Film film5 = new Film(2018, "film cu actoni fare premii5", new
                Actor[]{actorFaraPremiiO2, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        return studioDatabase;
    }

    public void allStudioNames() {
        for(Studio s : Data()) {
            if(s.filme.length > 2) {
                System.out.println(s.nume);
            }
        }
    }

    public void studioActoriOscaruri() {
        for(Studio s : Data()) {
            for(Film f : s.filme) {
                for (Actor a : f.actori) {
                    if(a.nume.equals("actor cu 2 oscaruri")) {
                        System.out.println(s.nume);
                    }
                }
            }
        }
    }

    public void movieNames() {
        for(Studio s : Data()) {
            for(Film f : s.filme) {
                for (Actor a : f.actori) {
                    if(a.varsta > 50) {
                        System.out.println(f.nume);
                    }
                }
            }
        }
    }

}
