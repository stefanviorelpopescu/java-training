package code._4_student_effort;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;
    private int damageReductionOnDefend;

    public Fighter(String name, int health, int damagePerAttack, int damageReductionOnDefend) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        this.damageReductionOnDefend = damageReductionOnDefend;
    }

    public void attack(Fighter opponent){
        defend(opponent.getDamagePerAttack());
    }

    public void defend(int attack){
        this.health -= attack-damageReductionOnDefend;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }
}
