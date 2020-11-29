package code._4_student_effort;

public class Fighter {

    private String name;
    private int health;
    private int damagePerAttack;

    // constructorul
    public Fighter(String name, int health, int damagePerAttack) {

        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    // metoda de atac
    public void attack(Fighter opponent) {
        opponent.setHealth(opponent.getHealth() - this.damagePerAttack);
    }

    // gettere pentru atribute
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    // setter pt healt
    public void setHealth(int health) {
        this.health = health;
    }
}
