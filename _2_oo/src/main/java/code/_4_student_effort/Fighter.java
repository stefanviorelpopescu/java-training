package code._4_student_effort;

public class Fighter {
    String name;
    int health;
    int damagePerAttack;

    public Fighter(String name, int health, int damagePrtAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePrtAttack;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }
}
