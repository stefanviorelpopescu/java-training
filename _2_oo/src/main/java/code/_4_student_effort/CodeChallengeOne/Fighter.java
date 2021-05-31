package code._4_student_effort.CodeChallengeOne;

public class Fighter {
    private int health;
    private String name;
    private int attackDamage;

public Fighter(String name,int health, int attackDamage)
{
    this.name=name;
    this.health=health;
    this.attackDamage=attackDamage;
}

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Fighter fighter)
    {
        fighter.setHealth(fighter.getHealth()-this.getAttackDamage());
    }
}


