package code._4_student_effort.challenge1;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter enemy) {
        enemy.health = enemy.health - this.damagePerAttack;
    }
}
