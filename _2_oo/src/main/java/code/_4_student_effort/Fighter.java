package code._4_student_effort;

public class Fighter { ;
    public String name;
    public int health;
    public int damage;

    public Fighter(String name, int damage, int health) {

        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void attack(Fighter punch) { punch.health = punch.health - punch.damage;}
}