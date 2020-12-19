package clean.code.design_patterns.requirements.person;

public class Coursant implements Person {

    private String coursantName;
    private int coursantAge;
    private String occupation;

    public Coursant(String coursantName, int coursantAge, String occupation) {
        this.coursantName = coursantName;
        this.coursantAge = coursantAge;
        this.occupation = occupation;
    }

    @Override
    public void showPersonDetails() {
        System.out.println(coursantName + ", " + coursantAge+ ", " + occupation);
    }

    public String getCoursantName() {
        return coursantName;
    }
}
