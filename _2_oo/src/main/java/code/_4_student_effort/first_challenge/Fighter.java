package first_challenge;

public class Fighter {

    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter() {
        this("N\\A", 100, 0);
    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public void fight (Fighter opponent) {
        opponent.setHealth(this.damagePerAttack);
    }
}
