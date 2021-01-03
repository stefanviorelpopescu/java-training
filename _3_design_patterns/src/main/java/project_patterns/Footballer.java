package project_patterns;

import java.util.List;

//Adapter part
public class Footballer implements EquippedFootballer {

    List<String> equipment = null;
    private String ability;
    private String position;

    public Footballer(String ability, String position) {
        this.ability = ability;
        this.position = position;
    }

    public String getAbility() {
        return ability;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "ability='" + ability + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    @Override
    public String equip() {
        return "Footballer equipped";
    }
}
