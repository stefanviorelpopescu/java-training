package project_patterns;

//Adapter part
public class PositionClassAdapterImpl extends Position implements PositionAdapter {

    @Override
    public Footballer getDefensiveAbility() {
        return getFootballer();
    }

    @Override
    public Footballer getPassingAbility() {
        Footballer footballer = getFootballer();
        return changeAbility(footballer, "passing");
    }

    @Override
    public Footballer getAttackingAbility() {
        Footballer footballer = getFootballer();
        return changeAbility(footballer, "shooting");
    }

    private Footballer changeAbility(Footballer footballer, String newAbility) {
        String newPosition = matchPositionAbility(newAbility);
        return new Footballer(footballer.getAbility() + " " + newAbility,
                footballer.getPosition() + " " + newPosition);
    }

    private String matchPositionAbility(String ability) {
        if (ability.contains("passing"))
            return "midfielder";
        else if (ability.contains("shooting"))
            return "striker";
        else return null;
    }
}
