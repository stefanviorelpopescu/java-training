package code._4_student_effort.challange_6;

public class Person {

    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMaried;

    private Person(PersonBuilder builder){
        this.name = builder.name;
    }

    public static class PersonBuilder{
        private String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMaried;

        public PersonBuilder(String name){
            this.name = name;
        }

        public PersonBuilder setJob(String job){
            this.job = job;
            return this;
        }

        public PersonBuilder setUniversity(String university){
            this.university = university;
            return this;
        }

        public PersonBuilder setDrivingLicense(boolean drivingLicense){
            this.drivingLicense = drivingLicense;
            return this;
        }

        public PersonBuilder setIsMaried(boolean isMaried){
            this.isMaried = isMaried;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUniversity() {
        return university;
    }

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMaried() {
        return isMaried;
    }
}
