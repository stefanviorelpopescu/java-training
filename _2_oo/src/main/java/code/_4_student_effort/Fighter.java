package code._4_student_effort;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

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

    public Fighter(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        this.setHealth(this.getHealth() - opponent.getDamagePerAttack());
    }

}
