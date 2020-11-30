package code._4_student_effort;

public class Film {
    private Integer appearanceYear;
    private String name;
    private Actor[] actors;

    public Film(){}

    public Film(Integer appearanceYear, String name, Actor[] actors) {
        this.appearanceYear = appearanceYear;
        this.name = name;
        this.actors = actors;
    }

    public Integer getAppearanceYear() {
        return appearanceYear;
    }

    public String getName() {
        return name;
    }

    public Actor[] getActors() {
        return actors;
    }
}
