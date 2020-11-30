package code._4_student_effort;

public class Fighter {
    String name;
    int health;
    int damagePerAttack;

    // constructor
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    // attack opponent method
    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }

}