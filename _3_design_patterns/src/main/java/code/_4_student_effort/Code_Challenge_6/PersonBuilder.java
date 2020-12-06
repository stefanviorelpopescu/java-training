package code._4_student_effort.Code_Challenge_6;

public class PersonBuilder {

    private String name;
    private String job;
    private String university;
    private String drivingLicense;
    private boolean isMarried;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public PersonBuilder(String name) {
        this.name = name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public PersonBuilder withJob(String job) {
        this.job = job;
        return this;
    }

    public PersonBuilder withUniversity(String university) {
        this.university = university;
        return this;
    }

    public PersonBuilder withDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
        return this;
    }

    public PersonBuilder withMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }
    public Person build(){
        return new Person(this);
    }
}
