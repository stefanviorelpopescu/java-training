package code._4_student_effort;

public class Person {
    private final String name;
    private final String job;
    private final String university;
    private final String drivingLicense;
    private final boolean isMarried;

    public Person(Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
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

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public String toString(){
        return "Person: " + this.name + " " + this.job + " " + this.university + " " + this.drivingLicense + " " + this.isMarried;
    }

    public static class Builder{
        private final String name;
        private String job;
        private String university;
        private String drivingLicense;
        private boolean isMarried;

        public Builder(String name){
            this.name = name;
        }

        public Builder job(String job){
            this.job = job;
            return this;
        }

        public Builder university(String university){
            this.university = university;
            return this;
        }

        public Builder drivingLicense(String drivingLicense){
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(boolean isMarried){
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
