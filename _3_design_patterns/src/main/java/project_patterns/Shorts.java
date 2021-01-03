package project_patterns;

//Decorator part
public class Shorts extends Equipment {
    public Shorts(EquippedFootballer footballer) {
        super(footballer);
    }


    public String equip() {

        return super.equip() + equipWithShorts();
    }

    private String equipWithShorts() {
        return " with Shorts";
    }
}

