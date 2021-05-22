package code._4_student_effort.challenge_1;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
}
