package code._4_student_effort.two_fighters;

public class Fighter {

    private String name;
    private double health;
    private double damagePerStrike;

    public Fighter(String name, double health, double damagePerStrike) {
        this.name = name;
        this.health = health;
        this.damagePerStrike = damagePerStrike;
    }

    protected void attack(Fighter fighter1, Fighter fighter2) {
        fighter2.health -= fighter1.damagePerStrike;
    }

    public double getHealth() {
        return health;
    }


    public String getName() {
        return name;
    }
}
