package code._4_student_effort.challenge1;

public class Fighter {
    private String name;
    private int heath;
    private int damagePerAttack;

    public Fighter(String name, int heath, int damagePerAttack) {
        this.name = name;
        this.heath = heath;
        this.damagePerAttack = damagePerAttack;
    }

    public String attack(Fighter opponent){
        if(this.damagePerAttack > opponent.damagePerAttack){
            return this.name;
        }
        else{
            return opponent.name;
        }
    }
}
