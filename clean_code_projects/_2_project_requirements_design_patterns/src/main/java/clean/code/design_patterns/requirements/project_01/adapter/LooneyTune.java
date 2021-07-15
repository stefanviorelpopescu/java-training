package clean.code.design_patterns.requirements.project_01.adapter;

public class LooneyTune extends CaracterDisney {

    public LooneyTune(String denumire, float nivelEnergie) {
        super(denumire, nivelEnergie);
    }

    @Override
    public void interactioneaza(float energie) {
        System.out.println("Disney: " + denumire);
        this.nivelEnergie -= energie;
    }

    @Override
    public void resetareEnergie() {
        System.out.println("Reset nivel energie");
        this.nivelEnergie = 100;
    }
}
