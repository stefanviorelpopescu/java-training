package code._4_student_effort;

public class Fighter {
    public int damagePerAttack;
    public int health;
    public String name;

    public void attack(Fighter x){
        x.health = x.health - this.damagePerAttack;
    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

}
