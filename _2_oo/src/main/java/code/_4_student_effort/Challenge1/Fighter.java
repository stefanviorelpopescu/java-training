package code._4_student_effort.Challenge1;

public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int heath, int damagePerAttack) {
        this.name = name;
        this.health = heath;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        opponent.health -= damagePerAttack;
    }
}
