package project_patterns;

//Adapter part
public class Position {

    public Footballer getFootballer() {
        return new Footballer("defensive", "defender");
    }
}
