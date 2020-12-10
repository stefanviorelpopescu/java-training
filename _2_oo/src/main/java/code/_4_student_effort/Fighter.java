package code._4_student_effort;

public class Fighter {
    private int health;
    private final int damagePerAttack;
    private final String name;

    public Fighter(String name, int health, int damageperAttack) {
        this.health = health;
        this.damagePerAttack = damageperAttack;
        this.name = name;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
