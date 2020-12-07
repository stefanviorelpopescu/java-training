package code._4_student_effort;

public class Person {
    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
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

    public boolean isDrivingLicense() {
        return drivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    private Person (Builder builder){
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    static class Builder{
        private String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMarried;

        public Builder(String name){
            this.name = name;
        }
        public Builder setJob(String job){
            this.job = job;
            return this;
        }
        public Builder setUniversity(String university){
            this.university = university;
            return this;
        }
        public Builder setDrivingLicense(boolean drivingLicense){
            this.drivingLicense = drivingLicense;
            return this;
        }
        public Builder setIsMarried(boolean isMarried){
            this.isMarried = isMarried;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", isMarried=" + isMarried +
                '}';
    }
}
