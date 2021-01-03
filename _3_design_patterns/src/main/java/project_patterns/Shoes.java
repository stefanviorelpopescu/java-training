package project_patterns;

//Decorator part
public class Shoes extends Equipment {
    public Shoes(EquippedFootballer footballer) {
        super(footballer);
    }

    public String equip() {
        return super.equip() + equipWithShoes();
    }

    private String equipWithShoes() {
        return " with Shoes";
    }
}

