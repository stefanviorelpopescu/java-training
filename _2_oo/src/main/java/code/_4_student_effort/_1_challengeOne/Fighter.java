package code._4_student_effort._1_challengeOne;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack (Fighter opponent) {
        this.health = this.health - opponent.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }
}

