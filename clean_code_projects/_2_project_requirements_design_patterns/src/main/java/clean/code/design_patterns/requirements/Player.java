package clean.code.design_patterns.requirements;

public class Player implements Observer {

    private String name;
    public Player(String name){
        this.name = name;
    }

    public void listenTo(Coach coach){
    coach.register(this);
    }
    @Override
    public void update(String message) {
        System.out.println("Player " + name + " Has done: " + message );
    }
}
