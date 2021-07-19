package code._4_student_effort;
//Challange 1
public class Fighter {
    public String name;
    public int damagePerAttacl;
    public int health;

    public Fighter(String name, int health, int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttacl=damagePerAttack;
    }

    public void attack(Fighter x){x.health=x.health-this.damagePerAttacl; }
}
