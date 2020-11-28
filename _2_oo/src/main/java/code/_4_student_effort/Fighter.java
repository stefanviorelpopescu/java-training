package code._4_student_effort;

public class Fighter {
    final String name;
    final int damagePerSAttack;
    int health;


    public Fighter(String name,int health,int damagePerSAttack) {
        this.name = name;
        this.health = health;
        this.damagePerSAttack = damagePerSAttack;
    }
    public void attack(Fighter opponent){
        opponent.health -= this.damagePerSAttack;
    }
}
