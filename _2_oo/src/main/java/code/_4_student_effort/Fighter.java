package code._4_student_effort;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name,int health,int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack=damagePerAttack;
    }
    public int getHealth(){
        return this.health;
    }

    public String getName() {
        return name;
    }

    public void attack(Fighter opponent){
        opponent.health = opponent.health - this.damagePerAttack;
    }
}
