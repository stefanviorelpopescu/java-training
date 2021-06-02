package code._3_in_class;

public class Person {
    private String name, job, university, drivingLicense;
    private int isMarried;

    public Person(String name, String job, String university, String drivingLicense, int isMaried) {
        this.name = name;
        this.job = job;
        this.university = university;
        this.drivingLicense = drivingLicense;
        this.isMarried = isMaried;
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

    public int getIsMarried() {
        return isMarried;
    }

    public Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    static class Builder {
        private final String name;
        private String job;
        private String university;
        private String drivingLicense;
        private int isMarried;

        public Builder(String name) {
            this.name = name;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Builder drivingLicense(String drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder isMarried(int isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
