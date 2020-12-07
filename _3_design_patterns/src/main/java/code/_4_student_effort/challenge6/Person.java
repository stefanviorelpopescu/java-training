package code._4_student_effort.challenge6;

public class Person {
    private String name;
    private String job;
    private String university;
    private boolean hasdrivingLicense;
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

    public boolean hasDrivingLicense() {
        return hasdrivingLicense;
    }

    public boolean isMarried() {
        return isMarried;
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.hasdrivingLicense = builder.hasdrivingLicense;
        this.isMarried = builder.isMarried;
    }

    public static class Builder {
        private String name;
        private String job;
        private String university;
        private boolean hasdrivingLicense;
        private boolean isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicense(boolean drivingLicense) {
            this.hasdrivingLicense = drivingLicense;
            return this;
        }

        public Builder SetIsMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }
}
