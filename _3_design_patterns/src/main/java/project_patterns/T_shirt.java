package project_patterns;

//Decorator part
public class T_shirt extends Equipment {
    public T_shirt(EquippedFootballer footballer) {
        super(footballer);
    }

    public String equip() {
        return super.equip() + equipWithTshirt();
    }

    private String equipWithTshirt() {
        return " with T-shirt";
    }
}
