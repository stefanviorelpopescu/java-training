package code._4_student_effort.Challenge6;

public class Person {

    private String name;
    private String job;
    private String university;
    private boolean drivingLicense;
    private boolean isMaried;

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMaried = builder.isMaried;
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private boolean drivingLicense;
        private boolean isMaried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withJob(String job) {
            this.job = job;
            return this;
        }

        public Builder withUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder withDrivingLicense(boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder withMaried(boolean maried) {
            isMaried = maried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}


