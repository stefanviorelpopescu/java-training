package project_patterns;

//Decorator part
public abstract class Equipment implements EquippedFootballer {
    private EquippedFootballer footballer;

    public Equipment(EquippedFootballer footballer) {
        this.footballer = new Footballer(null, null);
    }

    @Override
    public String equip() {
        return footballer.equip();
    }
}
