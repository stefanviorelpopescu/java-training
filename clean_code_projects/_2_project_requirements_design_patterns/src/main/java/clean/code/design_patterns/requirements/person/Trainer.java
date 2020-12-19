package clean.code.design_patterns.requirements.person;

public class Trainer implements Person {

    private String trainerName;
    private int age;
    private String proficientLanguage;

    public Trainer(String trainerName, int age, String proficientLanguage) {
        this.trainerName = trainerName;
        this.age = age;
        this.proficientLanguage = proficientLanguage;
    }

    @Override
    public void showPersonDetails() {
        System.out.println(trainerName + ", " + age + ", " + proficientLanguage);
    }

    public String getTrainerName() {
        return trainerName;
    }
}
