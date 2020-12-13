package code._4_student_effort._6_challenge;

public class Person {
    String name;
    String job;
    String university;
    Boolean drivingLicense;
    Boolean isMarried;

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", isMarried=" + isMarried +
                '}';
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.job = builder.job;
        this.university = builder.university;
        this.drivingLicense = builder.drivingLicense;
        this.isMarried = builder.isMarried;
    }

    public static class Builder {
        String name;
        String job;
        String university;
        Boolean drivingLicense;
        Boolean isMarried;

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

        public Builder withDrivingLicense(Boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder withMarried(Boolean married) {
            isMarried = married;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }
}